
package views.html.productAdmin

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.products._
/*2.2*/import models.users._
/*3.2*/import helper._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: Form[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*14.3*/("""

"""),format.raw/*16.50*/("""
"""),_display_(/*17.2*/productAdmin/*17.14*/.main("New Product", user)/*17.40*/ {_display_(Seq[Any](format.raw/*17.42*/("""

	"""),format.raw/*19.2*/("""<h3>Add a new Product</h3>
	
	"""),format.raw/*21.61*/("""
	"""),_display_(/*22.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*22.138*/ {_display_(Seq[Any](format.raw/*22.140*/("""
        """),_display_(/*23.10*/CSRF/*23.14*/.formField),format.raw/*23.24*/("""
        
		"""),format.raw/*27.11*/("""
        """),format.raw/*28.62*/("""
        """),_display_(/*29.10*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*29.77*/("""

		"""),_display_(/*31.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*31.81*/("""
        """),_display_(/*32.10*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*32.101*/("""
        
        """),format.raw/*34.37*/("""
        """),format.raw/*35.92*/("""
        """),_display_(/*36.10*/select(
            addProductForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*41.10*/("""

		"""),_display_(/*43.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*43.83*/("""
		"""),_display_(/*44.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*44.83*/("""
	
		"""),format.raw/*46.3*/("""<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add/ Update Product" class="btn btn-primary">
	  <a href=""""),_display_(/*51.14*/routes/*51.20*/.AdminController.products(0)),format.raw/*51.48*/("""">
			<button class="btn btn-warning">Cancel</button>
	  </a>
  </div>
	""")))}),format.raw/*55.3*/(""" """),format.raw/*55.4*/("""<!-- End Form definition -->

""")))}),format.raw/*57.2*/(""" """),format.raw/*57.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(addProductForm:Form[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((Form[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 09:01:29 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/productAdmin/addProduct.scala.html
                  HASH: bf2e45bc79740fbd809cdceb5a7935023b255d16
                  MATRIX: 664->1|696->27|725->50|1062->67|1200->323|1230->374|1258->376|1279->388|1314->414|1354->416|1384->419|1442->508|1471->511|1616->646|1657->648|1694->658|1707->662|1738->672|1778->782|1815->844|1852->854|1940->921|1971->926|2069->1003|2106->1013|2219->1104|2265->1150|2302->1242|2339->1252|2599->1491|2630->1496|2730->1575|2760->1579|2860->1658|2892->1663|3076->1820|3091->1826|3140->1854|3243->1927|3271->1928|3332->1959|3360->1960
                  LINES: 24->1|25->2|26->3|31->4|36->14|38->16|39->17|39->17|39->17|39->17|41->19|43->21|44->22|44->22|44->22|45->23|45->23|45->23|47->27|48->28|49->29|49->29|51->31|51->31|52->32|52->32|54->34|55->35|56->36|61->41|63->43|63->43|64->44|64->44|66->46|71->51|71->51|71->51|75->55|75->55|77->57|77->57
                  -- GENERATED --
              */
          