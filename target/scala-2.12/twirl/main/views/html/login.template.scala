
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
/*3.2*/import helper._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(LoginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""

"""),_display_(/*7.2*/main("Login Required", user)/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
"""),format.raw/*8.1*/("""<div class="col-sm-4">
  <h3>Sign in</h3>
	<!-- Display login errors if they exist -->
	"""),_display_(/*11.3*/if(LoginForm.hasGlobalErrors)/*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""
		  """),format.raw/*12.5*/("""<p class="alert alert-warning">
		      """),_display_(/*13.10*/LoginForm/*13.19*/.getGlobalError()),format.raw/*13.36*/("""
		  """),format.raw/*14.5*/("""</p>
	""")))}),format.raw/*15.3*/("""
    """),_display_(/*16.6*/if(flash.containsKey("error"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
		  """),format.raw/*17.5*/("""<div class="alert alert-warning">
		      """),_display_(/*18.10*/flash/*18.15*/.get("loginRequired")),format.raw/*18.36*/("""
		  """),format.raw/*19.5*/("""</div>
	""")))}),format.raw/*20.3*/("""
	"""),format.raw/*21.2*/("""<!-- The login form -->
	"""),_display_(/*22.3*/helper/*22.9*/.form(action = routes.HomeController.loginSubmit())/*22.60*/ {_display_(Seq[Any](format.raw/*22.62*/("""
		"""),_display_(/*23.4*/CSRF/*23.8*/.formField),format.raw/*23.18*/("""
		"""),format.raw/*24.3*/("""<div class="form-group">
			<input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*25.94*/LoginForm("email")/*25.112*/.getValue.orElse("")),format.raw/*25.132*/("""">
		</div>
		<div class="form-group">
			<input type="password" name="password" class="form-control input-xs" placeholder="Password">
		</div>

		<!-- Add a submit button -->
		<div class="form-group">
		    <input type="submit" value="Sign In" class="btn btn-primary">
		</div>
		""")))}),format.raw/*35.4*/("""
"""),format.raw/*36.1*/("""</div>
""")))}))
      }
    }
  }

  def render(LoginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(LoginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (LoginForm,user) => apply(LoginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 09:01:29 IST 2018
                  SOURCE: /home/wdd/webapps/REALSNEAKERS-master/app/views/login.scala.html
                  HASH: 2300882ea5001757edc019b2fb4aeeeb157164bc
                  MATRIX: 651->1|683->27|712->50|1068->67|1224->130|1252->133|1288->161|1327->163|1354->164|1469->253|1507->282|1547->284|1579->289|1647->330|1665->339|1703->356|1735->361|1772->368|1804->374|1843->404|1883->406|1915->411|1985->454|1999->459|2041->480|2073->485|2112->494|2141->496|2193->522|2207->528|2267->579|2307->581|2337->585|2349->589|2380->599|2410->602|2555->720|2583->738|2625->758|2938->1041|2966->1042
                  LINES: 24->1|25->2|26->3|31->4|36->5|38->7|38->7|38->7|39->8|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|52->21|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|56->25|56->25|66->35|67->36
                  -- GENERATED --
              */
          