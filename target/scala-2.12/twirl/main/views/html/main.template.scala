
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String, user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*9.62*/("""
        """),format.raw/*10.9*/("""<title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*12.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/styles.css")),format.raw/*13.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>

        <body id="index" data-spy="scroll" data-target=".navbar" data-offset="10">
        <nav class="navbar .navbar-inverse navbar-fixed-top">
                 <div class="container-fluid ">
                   <div class="navbar-header">
           <a class="navbar-brand" href=""""),_display_(/*26.43*/routes/*26.49*/.HomeController.index()),format.raw/*26.72*/(""""><span class="glyphicon glyphicon-fire"></span>Real Sneaker Reviews</a>
            </div>
              <ul class="nav navbar-nav navbar">
                
                
                <li><a href=""""),_display_(/*31.31*/routes/*31.37*/.HomeController.products()),format.raw/*31.63*/(""""><span class="glyphicon glyphicon-user"></span>products</a></li>
                <li class="nav-item">
                    """),_display_(/*33.22*/if(user != null)/*33.38*/ {_display_(Seq[Any](format.raw/*33.40*/("""
                      """),format.raw/*34.23*/("""<a class="nav-link" href=""""),_display_(/*34.50*/routes/*34.56*/.HomeController.logout()),format.raw/*34.80*/("""">Logout """),_display_(/*34.90*/user/*34.94*/.getName()),format.raw/*34.104*/("""</a>
                    """)))}/*35.23*/else/*35.28*/{_display_(Seq[Any](format.raw/*35.29*/("""
                      """),format.raw/*36.23*/("""<a class="nav-link" href=""""),_display_(/*36.50*/routes/*36.56*/.HomeController.login()),format.raw/*36.79*/("""">Login</a>
                    """)))}),format.raw/*37.22*/("""
                """),format.raw/*38.17*/("""</li>
                
               </ul>
               <ul class="nav navbar-nav navbar-right">
              
               <li><a href=""""),_display_(/*43.30*/routes/*43.36*/.HomeController.aboutUs()),format.raw/*43.61*/(""""><span class="glyphicon glyphicon-info-sign"></span></span> About Us</a></li>
                <li><a href=""""),_display_(/*44.31*/routes/*44.37*/.HomeController.contactUs()),format.raw/*44.64*/(""""><span class="glyphicon glyphicon-earphone"></span>Contact Us</a></li>
                </ul>
            </div>
          </div>
        </nav>
        <footer class="container-fluid">
            <p></p>
        </footer>
        """),_display_(/*52.10*/content),format.raw/*52.17*/("""
        
        """),format.raw/*54.9*/("""<script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.versioned("javascripts/main.js")),format.raw/*54.69*/("""" type="text/javascript"></script>
        <!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
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
                  DATE: Tue Apr 24 10:10:27 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/main.scala.html
                  HASH: d0fab048bca725aefc4d5fd0f2417e4811809286
                  MATRIX: 651->1|683->27|1018->51|1154->94|1181->95|1260->200|1296->209|1331->217|1357->222|1446->284|1461->290|1524->331|1607->387|1622->393|1686->435|1769->491|1784->497|1849->540|1937->601|1952->607|2013->646|2761->1367|2776->1373|2820->1396|3052->1601|3067->1607|3114->1633|3266->1758|3291->1774|3331->1776|3382->1799|3436->1826|3451->1832|3496->1856|3533->1866|3546->1870|3578->1880|3623->1907|3636->1912|3675->1913|3726->1936|3780->1963|3795->1969|3839->1992|3903->2025|3948->2042|4119->2186|4134->2192|4180->2217|4316->2326|4331->2332|4379->2359|4639->2592|4667->2599|4712->2617|4753->2631|4768->2637|4829->2677
                  LINES: 24->1|25->2|30->4|35->5|36->6|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|56->26|56->26|56->26|61->31|61->31|61->31|63->33|63->33|63->33|64->34|64->34|64->34|64->34|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|66->36|67->37|68->38|73->43|73->43|73->43|74->44|74->44|74->44|82->52|82->52|84->54|84->54|84->54|84->54
                  -- GENERATED --
              */
          