package advantage.stepdefinitions.login;

import advantage.stepdefinitions.base;
import advantage.tasks.login.login_task;
import advantage.userinterface.login.home_POM;
import advantage.userinterface.login.login_POM;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



 class login_step extends base{
	 private login_POM login;
	 
	 @Before
		public void setup() {
		
			Yefry.can(BrowseTheWeb.with(driver));
	}
	
	@Given("A user wishes to access the page")
		public void A_user_wishes_to_access_the_page() {
			Yefry.wasAbleTo(Open.browserOn().the(login));
		
	}
	
	@When("The user enters their credentials")
		public void The_user_enters_their_credentials() {
			Yefry.attemptsTo(login_task.Using("pepito07", "Pepito07"));
		
	}
	
	@Then("he user must access the page")
		public void he_user_must_access_the_page() {
		Yefry.should(seeThat(the(home_POM.LBL_UserIcon), isVisible()));
		
	}

}