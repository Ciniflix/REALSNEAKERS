
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


Seq[Any](format.raw/*10.1*/("""
 """),_display_(/*11.3*/main("About Us", user)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""
      """),format.raw/*12.7*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
      <div class="starter-template">
            <h1>The About Us Page</h1>
            <p class="lead">Who are we?</p>
          </div>
 """)))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 09:01:29 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/about.scala.html
                  HASH: 4f493539b963e1f549f04c4a20b8e06799c1ca3e
                  MATRIX: 651->1|987->138|1094->151|1123->154|1154->176|1194->178|1228->185
                  LINES: 24->1|29->9|34->10|35->11|35->11|35->11|36->12
                  -- GENERATED --
              */
          