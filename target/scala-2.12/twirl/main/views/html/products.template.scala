
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
              </tr>
            """)))}),format.raw/*62.14*/(""" """),format.raw/*62.32*/("""
            """),format.raw/*63.13*/("""</tbody>
            <tfoot>
              <tr scope="row">
                
              </tr>
            </tfoot>
          </table>

        </div>
 """)))}),format.raw/*72.3*/("""
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
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/products.scala.html
                  HASH: 2907f9f7d1b6e93cdf59f3dc6034d6225877b974
                  MATRIX: 651->1|683->27|1039->52|1203->123|1231->126|1261->148|1300->150|1333->157|1648->445|1663->451|1711->478|1854->594|1874->605|1902->612|1968->709|2009->780|2063->807|2108->836|2148->838|2191->853|2228->863|2243->869|2304->909|2383->960|2401->968|2431->976|2476->993|2540->1030|2557->1038|2597->1057|2668->1097|2697->1121|2737->1133|2836->1256|2877->1270|2918->1302|2958->1304|3001->1319|3081->1372|3095->1377|3131->1392|3174->1407|3225->1427|3266->1440|3721->1936|3762->1992|3803->2006|3846->2033|3886->2035|3929->2050|3994->2088|4010->2095|4037->2101|4091->2128|4107->2135|4136->2143|4186->2213|4231->2230|4263->2235|4279->2242|4320->2262|4374->2289|4390->2296|4426->2311|4480->2338|4496->2345|4526->2354|4605->2406|4659->2439|4729->2478|4758->2496|4799->2509|4984->2664
                  LINES: 24->1|25->2|30->4|35->5|36->6|36->6|36->6|37->7|43->13|43->13|43->13|44->14|44->14|44->14|47->17|48->18|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|51->21|52->22|52->22|52->22|52->22|54->24|54->24|56->26|62->32|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|69->39|80->50|81->51|82->52|82->52|82->52|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|87->57|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59|90->60|90->60|92->62|92->62|93->63|102->72
                  -- GENERATED --
              */
          