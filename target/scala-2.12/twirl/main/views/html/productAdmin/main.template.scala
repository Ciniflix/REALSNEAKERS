
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String, user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href=""""),_display_(/*13.29*/routes/*13.35*/.Assets.versioned("images/favicon.ico")),format.raw/*13.74*/("""">

    <title>My Site Home Page</title>

    <!-- Bootstrap 4.0 core CSS -->
    <link rel="stylesheet" 
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
          crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*24.65*/("""" rel="stylesheet">
  </head>

  <body>

    <!-- Navigation Menu-->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">

      <!-- Page 'brtand' (top left)-->
      <a class="navbar-brand" href=""""),_display_(/*33.38*/routes/*33.44*/.AdminController.products()),format.raw/*33.71*/("""">Admin Section</a>

      <!-- Responsive menu button - display when page is collapsed (e.g. mobile) -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navigation Links-->
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">

          <!-- Each link is a list item <li> -->
          <!-- nav-item active used to highlight current page-->
          
          <!-- Products -->
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*49.40*/routes/*49.46*/.AdminController.products()),format.raw/*49.73*/("""">Products Admin</a>
          </li>

          <!-- Login / Logout -->
          <li class="nav-item">
              """),_display_(/*54.16*/if(user != null)/*54.32*/ {_display_(Seq[Any](format.raw/*54.34*/("""
                """),format.raw/*55.17*/("""<a class="nav-link" href=""""),_display_(/*55.44*/routes/*55.50*/.HomeController.logout()),format.raw/*55.74*/("""">Logout """),_display_(/*55.84*/user/*55.88*/.getName()),format.raw/*55.98*/("""</a>
              """)))}/*56.17*/else/*56.22*/{_display_(Seq[Any](format.raw/*56.23*/("""
                """),format.raw/*57.17*/("""<a class="nav-link" href=""""),_display_(/*57.44*/routes/*57.50*/.HomeController.login()),format.raw/*57.73*/("""">Login</a>
              """)))}),format.raw/*58.16*/("""
          """),format.raw/*59.11*/("""</li>
        </ul> <!-- End of Nav list-->

      </div>
    </nav>

    <!-- Content area-->
    <main role="main" class="container-fluid">
      <!-- Page content goes here -->
      """),_display_(/*68.8*/content),format.raw/*68.15*/("""

    """),format.raw/*70.5*/("""</main><!-- /.container -->

    <!-- Page Footer-->
    <!-- css class .footer defined in ./css/style.css -->
    <footer class="footer">
        <div class="container">
          <span class="text-muted">Place footer content here.</span>
        </div>
      </footer>
    
    <!-- script.js-->  
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("javascripts/script.js")),format.raw/*81.67*/(""""></script>
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <!-- Font Awesome-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">

  </body>
</html>

"""))
      }
    }
  }

  def render(title:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 09:01:29 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/productAdmin/main.scala.html
                  HASH: 6c345ca79dc2e04514bc9f78fcc2e55520419418
                  MATRIX: 664->1|696->27|1031->51|1167->94|1194->95|1486->360|1501->366|1561->405|1975->792|1990->798|2052->839|2297->1057|2312->1063|2360->1090|3131->1834|3146->1840|3194->1867|3340->1986|3365->2002|3405->2004|3450->2021|3504->2048|3519->2054|3564->2078|3601->2088|3614->2092|3645->2102|3684->2123|3697->2128|3736->2129|3781->2146|3835->2173|3850->2179|3894->2202|3952->2229|3991->2240|4204->2427|4232->2434|4265->2440|4610->2758|4625->2764|4688->2806
                  LINES: 24->1|25->2|30->4|35->5|36->6|43->13|43->13|43->13|54->24|54->24|54->24|63->33|63->33|63->33|79->49|79->49|79->49|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|87->57|88->58|89->59|98->68|98->68|100->70|111->81|111->81|111->81
                  -- GENERATED --
              */
          