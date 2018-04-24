
package views.html

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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Product],List[Category],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.3*/(productList: List[Product], categoryList: List[Category], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
 """),_display_(/*6.3*/main("Products" ,user)/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
      """),format.raw/*7.7*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
      <div class="row">
        <div class="col-sm-4">
          <h4>Categories</h4>
          <!-- https://getbootstrap.com/docs/4.0/components/list-group/ -->
          <div class="list-group text-right">
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.HomeController.products(0)),format.raw/*13.56*/("""" class="list-group-item  list-group-item-action">All Categories
              <span class="badgeImage badge-secondary">"""),_display_(/*14.57*/productList/*14.68*/.size()),format.raw/*14.75*/("""</span>
            </a>

            """),format.raw/*17.72*/("""
            """),format.raw/*18.71*/("""
            
            """),_display_(/*20.14*/for(category <- categoryList) yield /*20.43*/ {_display_(Seq[Any](format.raw/*20.45*/("""
              """),format.raw/*21.15*/("""<a href=""""),_display_(/*21.25*/routes/*21.31*/.HomeController.products(category.getId)),format.raw/*21.71*/("""" class="list-group-item  list-group-item-action">"""),_display_(/*21.122*/category/*21.130*/.getName),format.raw/*21.138*/("""
                """),format.raw/*22.17*/("""<span class="badge badge-secondary">"""),_display_(/*22.54*/category/*22.62*/.getProducts.size()),format.raw/*22.81*/("""</span>
              </a>
            """)))}),format.raw/*24.14*/(""" """),format.raw/*24.38*/("""

          """),format.raw/*26.11*/("""</div>

        </div>
          </div>
        <div class="row">
          <div class="col-sm-8">

            """),format.raw/*33.65*/("""
            """),_display_(/*34.14*/if(flash.containsKey("success"))/*34.46*/ {_display_(Seq[Any](format.raw/*34.48*/("""
              """),format.raw/*35.15*/("""<div class="alert alert-success">
                  """),_display_(/*36.20*/flash/*36.25*/.get("success")),format.raw/*36.40*/("""
              """),format.raw/*37.15*/("""</div>
            """)))}),format.raw/*38.14*/(""" 

          """),format.raw/*40.11*/("""<!-- https://getbootstrap.com/docs/4.0/content/tables/ -->

          <table class="table table-hover">
            <thead>
              <th style="width: 20%">ID</th>
              <th style="width: 20%">Name</th>
              <th style="width: 20%">Category</th>
              <th style="width: 20%">Description</th>
              <th style="width: 10%">Stock</th>
              <th style="width: 10%">Price</th>
            </thead>
            <tbody>
            """),format.raw/*52.82*/("""
            """),format.raw/*53.56*/("""
            """),_display_(/*54.14*/for(product <- productList) yield /*54.41*/ {_display_(Seq[Any](format.raw/*54.43*/("""
              """),format.raw/*55.15*/("""<tr scope="row">
                <td>"""),_display_(/*56.22*/product/*56.29*/.getId),format.raw/*56.35*/("""</td>
                <td>"""),_display_(/*57.22*/product/*57.29*/.getName),format.raw/*57.37*/("""</td>
                """),format.raw/*58.65*/("""
                """),format.raw/*59.17*/("""<td>"""),_display_(/*59.22*/product/*59.29*/.getCategory.getName),format.raw/*59.49*/("""</td>
                <td>"""),_display_(/*60.22*/product/*60.29*/.getDescription),format.raw/*60.44*/("""</td>
                <td>"""),_display_(/*61.22*/product/*61.29*/.getStock),format.raw/*61.38*/("""</td>
                <td class="text-right">&euro;"""),_display_(/*62.47*/("%.2f".format(product.getPrice))),format.raw/*62.80*/("""</td>
              </tr>
            """)))}),format.raw/*64.14*/(""" """),format.raw/*64.32*/("""
            """),format.raw/*65.13*/("""</tbody>
            <tfoot>
              <tr scope="row">
                
              </tr>
            </tfoot>
          </table>
      
 """)))}),format.raw/*73.3*/("""
"""))
      }
    }
  }

  def render(productList:List[Product],categoryList:List[Category],user:User): play.twirl.api.HtmlFormat.Appendable = apply(productList,categoryList,user)

  def f:((List[Product],List[Category],User) => play.twirl.api.HtmlFormat.Appendable) = (productList,categoryList,user) => apply(productList,categoryList,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 10:09:27 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/products.scala.html
                  HASH: 50cb324887b49d7bd0fd7f2056448af78f2e53de
                  MATRIX: 651->1|683->27|1039->52|1203->123|1231->126|1261->148|1300->150|1333->157|1645->442|1660->448|1708->475|1856->596|1876->607|1904->614|1970->711|2011->782|2065->809|2110->838|2150->840|2193->855|2230->865|2245->871|2306->911|2385->962|2403->970|2433->978|2478->995|2542->1032|2559->1040|2599->1059|2670->1099|2699->1123|2739->1135|2879->1299|2920->1313|2961->1345|3001->1347|3044->1362|3124->1415|3138->1420|3174->1435|3217->1450|3268->1470|3309->1483|3807->2022|3848->2078|3889->2092|3932->2119|3972->2121|4015->2136|4080->2174|4096->2181|4123->2187|4177->2214|4193->2221|4222->2229|4272->2299|4317->2316|4349->2321|4365->2328|4406->2348|4460->2375|4476->2382|4512->2397|4566->2424|4582->2431|4612->2440|4691->2492|4745->2525|4815->2564|4844->2582|4885->2595|5061->2741
                  LINES: 24->1|25->2|30->4|35->5|36->6|36->6|36->6|37->7|43->13|43->13|43->13|44->14|44->14|44->14|47->17|48->18|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|51->21|52->22|52->22|52->22|52->22|54->24|54->24|56->26|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|68->38|70->40|82->52|83->53|84->54|84->54|84->54|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|89->59|89->59|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|94->64|94->64|95->65|103->73
                  -- GENERATED --
              */
          