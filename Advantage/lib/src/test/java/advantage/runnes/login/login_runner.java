package advantage.runnes.login;

import org.junit.runner.RunWith;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
				glue = "src.test.java.advantage.stepdefinitions.login",
				tags="")


public class login_runner {
	 
	    
	
	
}