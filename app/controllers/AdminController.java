package controllers;

import controllers.security.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import play.mvc.Http.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.Logger;

// Import models and views
import models.users.*;
import models.products.*;

import views.html.productAdmin.*;


/* - Docs -
http://superuser.com/questions/163818/how-to-install-rmagick-on-ubuntu-10-04
http://im4java.sourceforge.net/
*/

/* Enforce Access Control for this controller - Admin users only!! */
// Authenticate user
@Security.Authenticated(Secured.class)

// Authorise user (check if admin)
@With(CheckIfAdmin.class)
public class AdminController extends Controller {

    /** Dependency Injection **/
    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    /** http://stackoverflow.com/a/10159220/6322856 **/

    private FormFactory formFactory;

    // AdminController Constructor
    @Inject
    public AdminController(FormFactory f) {
        this.formFactory = f;
    }


    // Get a user - if logged in email will be set in the session
	private User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}
    
    public Result index() {
        return redirect(controllers.routes.AdminController.products(0));
    }

	// Get a list of products
    // If cat parameter is 0 then return all products
    // Otherwise return products for a category (by id)
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
    
    // Load the add product view
    // Display an empty form in the view
    @Transactional
    public Result addProduct() {   
        // Instantiate a form object based on the Product class
        Form<Product> addProductForm = formFactory.form(Product.class);
        // Render the Add Product View, passing the form object
        return ok(addProduct.render(addProductForm, getCurrentUser()));
    }

    @Transactional
    public Result addProductSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on Product class annotations)	
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getCurrentUser()));
        }
        
        // Save if new (no id) otherwise update product
        Product p = newProductForm.get();
        if (p.getId() != null) {
            p.update();
        }
        else {
            p.save();
        }

        // Set a flash message
        flash("success", "Product " + newProductForm.get().getName() + " has been created or updated");
        
        // Redirect to the  products page
        return redirect(controllers.routes.AdminController.products(0));
    }

        // Load the add product view
    // Display an empty form in the view
    @Transactional
    public Result updateProduct(Long id) {

        // Retrieve the product by id
        Product editProduct = Product.find.byId(id);
        
        if (editProduct == null){
            return badRequest("error");
        }
        
        // Create a form based on the Product class
        Form<Product> updateProductForm = formFactory.form(Product.class).fill(editProduct);
        // Render the Add Product View, passing the form object
        return ok(addProduct.render(updateProductForm, getCurrentUser()));
    }

    // Delete Product
    @Transactional
    public Result deleteProduct(Long id) {
        // Call delete method
        Product.find.ref(id).delete();
        // Add message to flash session 
        flash("success", "Product has been deleted");
        // Redirect home
        return redirect(controllers.routes.HomeController.products(0));
    }
}
