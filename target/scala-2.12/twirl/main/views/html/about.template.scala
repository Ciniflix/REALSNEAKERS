
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
/*1.2*/import models.users._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /* Param List */
  def apply/*9.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*10.2*/main("About Us", user)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""
      """),format.raw/*11.7*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
      <div class="starter-template">
            <h1> Our Purpose</h1>

            <img src="AboutUs.jpg" alt="AboutUs" style="width:auto;">
            <p class="lead">Real Retail Reviews is a new review website that enables users to login and leave reviews on shoes.
               With all genders to choose from.Everyone likes to keep up to date in the latest fashion in footwear. From all 
               ages and all categories Men's Women's and kids, everyone individuall from the day we are born we following some sort of trend.
               Trends is what is what is popular at a certain point in time. Trends can be influenced by anyone, friends, celebrities,bloggers, adds.
               In todays culture, we believe everyone cares about what is trending and word of mouth is a key factor in this. Coming with a retail backgrounds we are inspired 
             to get the best possible information for clothing, as well as user experience. Interaction from user to also leave reviews can help educate others in 
              what is trending and what isnt.. </p>
              <p><strong>non profit website:</strong>  our only goal is giving users good recommendations. 
              </p>
              
            </div>
 """)))}),format.raw/*27.3*/("""
 """))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 10:15:17 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/about.scala.html
                  HASH: b2fc40e38e6e428c3a3252a368f9825b66bbd3a0
                  MATRIX: 651->1|987->138|1094->152|1125->174|1165->176|1199->183|2554->1508
                  LINES: 24->1|29->9|34->10|34->10|34->10|35->11|51->27
                  -- GENERATED --
              */
          