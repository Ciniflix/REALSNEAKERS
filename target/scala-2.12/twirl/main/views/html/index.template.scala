
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home" , user)/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
 
  """),format.raw/*4.3*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
  <li data-target="#myCarousel" data-slide-to="1"></li>
  <li data-target="#myCarousel" data-slide-to="2"></li>

  </ol>
  
  <!-- Wrapper for slides -->
  <div class="carousel-inner">
  <div class="item active">
  <img src="/assets/images/Addias.jpg" alt="Sale">
  <div class="carousel-caption">
  <h3>Back To Black</h3>
  <p>Addias Orginals</p>
  </div> 
  </div>
  
  
  <div class="item">
  <img src="/assets/images/Vapermax.jpg" alt="Vapermax">
  <div class="carousel-caption">
    <h3>The Best Shoes for summer</h3>
    <p>Vapermax</p>
    </div> 
  </div>
  
  
  <div class="item">
  <img src="/assets/images/Converse.jpg" alt="Converse">
  <div class="carousel-caption">
    <h3>Old School</h3>
    <p>Best selling Shoes for Girls</p>
    </div>   
  </div>
  
  
  
  
  
  </div>
  
  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
  <span class="glyphicon glyphicon-chevron-left"></span>
  <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
  <span class="glyphicon glyphicon-chevron-right"></span>
  <span class="sr-only">Next</span>
  </a>
  </div>
  <style>
  .carousel-inner img """),format.raw/*58.23*/("""{"""),format.raw/*58.24*/("""
  
  """),format.raw/*60.3*/("""width: 60%; /* Set width to 100% */
  margin: auto;
  height:40%;
  """),format.raw/*63.3*/("""}"""),format.raw/*63.4*/("""
  """),format.raw/*64.3*/("""</style>
 <div class="container"> 
  <div class="row">
  <div class="col-sm-4">
 <div class="panel panel-primary">
 <div class="panel-heading">Mens</div>
  <div class="panel-body"><img src="/assets/images/VansFlame.jpg" style="width:50% ;height:50%" alt="VansFlame"></div>
  <div class="panel-footer"> </div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-danger">
  <div class="panel-heading">Lowkey runners for Women</div>
  <div class="panel-body"><img src="/assets/images/AdidasWomenN.jpg" style="width:100%" alt="AdidasWomenN"></div>
  <div class="panel-footer"></div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-warning">
  <div class="panel-heading">Kids </div>
  <div class="panel-body"><img src="/assets/images/Wonder.jpg"class="img-responsive" style="width:100%" alt=""></div>
  <div class="panel-footer"> </div>
  </div>
  </div>
  </div>
  </div>
  <div class="container"> 
  <div class="row">
  <div class="col-sm-4">
  <div class="panel panel-primary ">
  <div class="panel-heading"> Mens </div>
  <div class="panel-body"><img src="/assets/images/Paddington.jpg" class="img-responsive" style="width:100%" alt=""></div>
  <div class="panel-footer"></div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-danger ">
  <div class="panel-heading">womens</div>
  <div class="panel-body"><img src="/assets/images/NikeAirMax270.jpg" class="img-responsive" style="width:100%" alt="NikeAirMax270"></div>
  <div class="panel-footer"> </div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-warning">
  <div class="panel-heading">Kids </div>
  <div class="panel-body"><img src="/assets/images/JusticeLeague.jpg" class="img-responsive" style="width:100%" alt=""></div>
  <div class="panel-footer"></div>
  </div>
  </div>
  </div>
  </div><br><br> 
""")))}),format.raw/*115.2*/(""" """))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 10:24:34 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/index.scala.html
                  HASH: 7ece8310707d38e2d9135761d23c35d29158782e
                  MATRIX: 959->1|1077->27|1104->46|1143->48|1174->53|2618->1469|2647->1470|2680->1476|2775->1544|2803->1545|2833->1548|4706->3390
                  LINES: 28->1|33->2|33->2|33->2|35->4|89->58|89->58|91->60|94->63|94->63|95->64|146->115
                  -- GENERATED --
              */
          