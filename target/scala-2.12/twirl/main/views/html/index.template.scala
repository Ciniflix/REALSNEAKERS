
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
  <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>
  
  <!-- Wrapper for slides -->
  <div class="carousel-inner">
  <div class="item active">
  <img src="/assets/images/Addias.jpg" alt="Sale">
  <div class="carousel-caption">
  <h3>This months reviews</h3>
  <p>* The latest 5 sneakers reviews *</p>
  </div> 
  </div>
  
  
  <div class="item">
  <img src="/assets/images/Addias.jpg" alt="TV">
  <div class="carousel-caption">
    <h3>This months reviews</h3>
    <p>* The latest 5 sneakers reviews *</p>
    </div> 
  </div>
  
  
  <div class="item">
  <img src="/assets/images/Addias.jpg" alt="iPhone">
  <div class="carousel-caption">
    <h3>This months reviews</h3>
    <p>* The latest 5 sneakers reviews *</p>
    </div>   
  </div>
  
  <div class="item">
  <img src="/assets/images/Addias.jpg" alt="Macbook">
  <div class="carousel-caption">
    <h3>This months reviews</h3>
    <p>* The latest 5 sneakers reviews *</p>
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
  .carousel-inner img """),format.raw/*64.23*/("""{"""),format.raw/*64.24*/("""
  
  """),format.raw/*66.3*/("""width: 60%; /* Set width to 100% */
  margin: auto;
  height:60%;
  """),format.raw/*69.3*/("""}"""),format.raw/*69.4*/("""
  """),format.raw/*70.3*/("""</style>
 <div class="container"> 
  <div class="row">
  <div class="col-sm-4">
 <div class="panel panel-primary">
 <div class="panel-heading">Mens</div>
  <div class="panel-body"><img src="/assets/images/MensShirt.jpg" style="width:100%" alt="Starwars2"></div>
  <div class="panel-footer"> </div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-danger">
  <div class="panel-heading">womens </div>
  <div class="panel-body"><img src="/assets/images/WomensSneakers.jpg" style="width:100%" alt="daddysHome2"></div>
  <div class="panel-footer"></div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-warning">
  <div class="panel-heading">Kids </div>
  <div class="panel-body"><img src="/assets/images/Wonder.jpg"class="img-responsive" style="width:100%" alt="Image"></div>
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
  <div class="panel-body"><img src="/assets/images/Paddington.jpg" class="img-responsive" style="width:100%" alt="Paddington2"></div>
  <div class="panel-footer"></div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-danger ">
  <div class="panel-heading">womens</div>
  <div class="panel-body"><img src="/assets/images/PitchPerfect3.jpg" class="img-responsive" style="width:100%" alt="PitchPerfect3"></div>
  <div class="panel-footer"> </div>
  </div>
  </div>
  <div class="col-sm-4"> 
  <div class="panel panel-warning">
  <div class="panel-heading">Kids </div>
  <div class="panel-body"><img src="/assets/images/JusticeLeague.jpg" class="img-responsive" style="width:100%" alt="JusticeLeague"></div>
  <div class="panel-footer"></div>
  </div>
  </div>
  </div>
  </div><br><br> 
""")))}),format.raw/*121.2*/(""" """))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 09:01:29 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/index.scala.html
                  HASH: 90301c5d10a928f17099144c4ef64111541e80f2
                  MATRIX: 959->1|1077->27|1104->46|1143->48|1174->53|2921->1772|2950->1773|2983->1779|3078->1847|3106->1848|3136->1851|5011->3695
                  LINES: 28->1|33->2|33->2|33->2|35->4|95->64|95->64|97->66|100->69|100->69|101->70|152->121
                  -- GENERATED --
              */
          