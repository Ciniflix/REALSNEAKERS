
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
        <div class="col-sm-8">
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

   

            """),format.raw/*32.65*/("""
            """),_display_(/*33.14*/if(flash.containsKey("success"))/*33.46*/ {_display_(Seq[Any](format.raw/*33.48*/("""
              """),format.raw/*34.15*/("""<div class="alert alert-success">
                  """),_display_(/*35.20*/flash/*35.25*/.get("success")),format.raw/*35.40*/("""
              """),format.raw/*36.15*/("""</div>
            """)))}),format.raw/*37.14*/(""" 

          """),format.raw/*39.11*/("""<!-- https://getbootstrap.com/docs/4.0/content/tables/ -->

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
            """),format.raw/*51.82*/("""
            """),format.raw/*52.56*/("""
            """),_display_(/*53.14*/for(product <- productList) yield /*53.41*/ {_display_(Seq[Any](format.raw/*53.43*/("""
              """),format.raw/*54.15*/("""<tr scope="row">
                <td>"""),_display_(/*55.22*/product/*55.29*/.getId),format.raw/*55.35*/("""</td>
                <td>"""),_display_(/*56.22*/product/*56.29*/.getName),format.raw/*56.37*/("""</td>
                """),format.raw/*57.65*/("""
           
        """),format.raw/*59.9*/("""</div>     <td>"""),_display_(/*59.25*/product/*59.32*/.getCategory.getName),format.raw/*59.52*/("""</td>
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
                  DATE: Tue Apr 24 09:48:45 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/products.scala.html
                  HASH: e77b77968731ba9916dee5010d5033deb95117da
                  MATRIX: 651->1|683->27|1039->52|1203->123|1231->126|1261->148|1300->150|1333->157|1645->442|1660->448|1708->475|1851->591|1871->602|1899->609|1965->706|2006->777|2060->804|2105->833|2145->835|2188->850|2225->860|2240->866|2301->906|2380->957|2398->965|2428->973|2473->990|2537->1027|2554->1035|2594->1054|2665->1094|2694->1118|2734->1130|2803->1223|2844->1237|2885->1269|2925->1271|2968->1286|3048->1339|3062->1344|3098->1359|3141->1374|3192->1394|3233->1407|3731->1946|3772->2002|3813->2016|3856->2043|3896->2045|3939->2060|4004->2098|4020->2105|4047->2111|4101->2138|4117->2145|4146->2153|4196->2223|4244->2244|4287->2260|4303->2267|4344->2287|4398->2314|4414->2321|4450->2336|4504->2363|4520->2370|4550->2379|4629->2431|4683->2464|4753->2503|4782->2521|4823->2534|4999->2680
                  LINES: 24->1|25->2|30->4|35->5|36->6|36->6|36->6|37->7|43->13|43->13|43->13|44->14|44->14|44->14|47->17|48->18|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|51->21|52->22|52->22|52->22|52->22|54->24|54->24|56->26|62->32|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|69->39|81->51|82->52|83->53|83->53|83->53|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|89->59|89->59|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|94->64|94->64|95->65|103->73
                  -- GENERATED --
              */
          