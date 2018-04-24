
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Product],List[Category],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.3*/(productList: List[Product], categoryList: List[Category], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
 """),_display_(/*6.3*/productAdmin/*6.15*/.main("Products", user)/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
      """),format.raw/*7.7*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
      <div class="row">
        <div class="col-sm-auto">
          <h4>Categories</h4>
          <!-- https://getbootstrap.com/docs/4.0/components/list-group/ -->
          <div class="list-group text-right">
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.HomeController.products(0)),format.raw/*13.56*/("""" class="list-group-item  list-group-item-action">All Categories
              <span class="badge badge-secondary">"""),_display_(/*14.52*/productList/*14.63*/.size()),format.raw/*14.70*/("""</span>
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

        <div class="col-sm-auto">

            """),format.raw/*32.65*/("""
            """),_display_(/*33.14*/if(flash.containsKey("success"))/*33.46*/ {_display_(Seq[Any](format.raw/*33.48*/("""
              """),format.raw/*34.15*/("""<div class="alert alert-success">
                  """),_display_(/*35.20*/flash/*35.25*/.get("success")),format.raw/*35.40*/("""
              """),format.raw/*36.15*/("""</div>
            """)))}),format.raw/*37.14*/(""" 

          """),format.raw/*39.11*/("""<!-- https://getbootstrap.com/docs/4.0/content/tables/ -->
          <table class="table table-hover">
            <thead>
              <th scope="col">ID</th>
              <th scope="col">Name</th>
              <th scope="col">Category</th>
              <th scope="col">Description</th>
              <th scope="col">Stock</th>
              <th scope="col">Price</th>
            </thead>
            <tbody>
            """),format.raw/*50.82*/("""
            """),format.raw/*51.56*/("""
            """),_display_(/*52.14*/for(product <- productList) yield /*52.41*/ {_display_(Seq[Any](format.raw/*52.43*/("""
              """),format.raw/*53.15*/("""<tr scope="row">
                <td>"""),_display_(/*54.22*/product/*54.29*/.getId),format.raw/*54.35*/("""</td>
                <td>"""),_display_(/*55.22*/product/*55.29*/.getName),format.raw/*55.37*/("""</td>
                """),format.raw/*56.65*/("""
                """),format.raw/*57.17*/("""<td>"""),_display_(/*57.22*/product/*57.29*/.getCategory.getName),format.raw/*57.49*/("""</td>
                <td>"""),_display_(/*58.22*/product/*58.29*/.getDescription),format.raw/*58.44*/("""</td>
                <td>"""),_display_(/*59.22*/product/*59.29*/.getStock),format.raw/*59.38*/("""</td>
                <td class="text-right">&euro;"""),_display_(/*60.47*/("%.2f".format(product.getPrice))),format.raw/*60.80*/("""</td>
                <td>
                  <!-- https://fontawesome.com/get-started/web-fonts-with-css -->
                  <!-- https://fontawesome.com/icons?d=gallery -->
                  <!-- https://getbootstrap.com/docs/4.0/components/buttons/ -->
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.AdminController.updateProduct(product.getId)),format.raw/*65.82*/("""" class="btn btn-outline-danger btn-sm">
                    <i class="far fa-edit"></i></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.AdminController.deleteProduct(product.getId)),format.raw/*70.82*/("""" class="btn btn-outline-danger btn-sm"
                    onclick="return confirmDel();">
                    <i class="far fa-trash-alt"></i></a>
                  </td>

              </tr>
            """)))}),format.raw/*76.14*/(""" """),format.raw/*76.32*/("""
            """),format.raw/*77.13*/("""</tbody>
            <tfoot>
              <tr scope="row">
                
              </tr>
            </tfoot>
          </table>
		  
          <div>
              <a href=""""),_display_(/*86.25*/routes/*86.31*/.AdminController.addProduct()),format.raw/*86.60*/("""">
                <button class="btn btn-primary">Add a Product</button>
              </a>
          </div>

        </div>
 """)))}),format.raw/*92.3*/("""
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
                  DATE: Tue Apr 24 09:01:29 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/productAdmin/products.scala.html
                  HASH: ff0c276dd906753f052bd79d95defa035998956b
                  MATRIX: 664->1|696->27|1052->52|1216->123|1244->126|1264->138|1295->161|1334->163|1367->170|1682->458|1697->464|1745->491|1888->607|1908->618|1936->625|2002->722|2043->793|2097->820|2142->849|2182->851|2225->866|2262->876|2277->882|2338->922|2417->973|2435->981|2465->989|2510->1006|2574->1043|2591->1051|2631->1070|2702->1110|2731->1134|2771->1146|2870->1269|2911->1283|2952->1315|2992->1317|3035->1332|3115->1385|3129->1390|3165->1405|3208->1420|3259->1440|3300->1453|3755->1949|3796->2005|3837->2019|3880->2046|3920->2048|3963->2063|4028->2101|4044->2108|4071->2114|4125->2141|4141->2148|4170->2156|4220->2226|4265->2243|4297->2248|4313->2255|4354->2275|4408->2302|4424->2309|4460->2324|4514->2351|4530->2358|4560->2367|4639->2419|4693->2452|5007->2739|5022->2745|5088->2790|5334->3009|5349->3015|5415->3060|5653->3267|5682->3285|5723->3298|5932->3480|5947->3486|5997->3515|6155->3643
                  LINES: 24->1|25->2|30->4|35->5|36->6|36->6|36->6|36->6|37->7|43->13|43->13|43->13|44->14|44->14|44->14|47->17|48->18|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|51->21|52->22|52->22|52->22|52->22|54->24|54->24|56->26|62->32|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|69->39|80->50|81->51|82->52|82->52|82->52|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|87->57|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59|90->60|90->60|95->65|95->65|95->65|100->70|100->70|100->70|106->76|106->76|107->77|116->86|116->86|116->86|122->92
                  -- GENERATED --
              */
          