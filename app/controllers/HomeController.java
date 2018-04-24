package controllers;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

// Import models and views
import models.users.*;
import models.products.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /** Dependency Injection **/

    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    // Get a user - if logged in email will be set in the session
	private User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(getCurrentUser()));
    }

    public Result aboutUs() {
        return ok(about.render(getCurrentUser()));
    }

    public Result contactUs() {
        return ok(contactUs.render(getCurrentUser()));
    }

    @Transactional
    public Result products(Long cat) {

        // Find the products (in the DB) and add to a Product arrayList
        // Calls the find.all() method of Product - from the Model superclass
        // https://www.playframework.com/documentation/2.6.x/JavaEbean#Using-Model-superclass
        List<Product> productList = new ArrayList<Product>();
        List<Category> categoryList = Category.find.query().where().orderBy("name asc").findList();

        if (cat == 0) {
            productList = Product.find.all();
        }
        else {
            // Get products for selected category
            // Find category then extract products
            productList = Category.find.ref(cat).getProducts();
        }

        // Return the view, passing the product list as a parameter
        return ok(products.render(productList, categoryList, getCurrentUser()));
    }

    @Transactional
    public Result login() {
	   // Pass a login form to the login view and render
	   return ok(login.render(formFactory.form(Login.class), getCurrentUser()));
    }

    // Process the user login form
    //@Transactional
    public Result loginSubmit() {
        // Bind form instance to the values submitted from the form  
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        // Check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()) {
            // If errors, show the form again
            return badRequest(login.render(loginForm, getCurrentUser()));
        } 
        else {
            // User Logged in successfully
            // Clear the existing session
            session().clear();
            // Store the logged in email in the session
            session("email", loginForm.get().getEmail());
            
            // Check user type
            User u = User.getLoggedIn(loginForm.get().getEmail());
            // If admin - go to admin section
            if (u != null && "admin".equals(u.getRole())) {
                return redirect(controllers.routes.AdminController.index());
            }
            
            // Return to home page
            return redirect(controllers.routes.HomeController.index());
        }
    }

    @Transactional
    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.HomeController.login());
    }

}
