package advantage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class base{
	
	public static Actor Yefry = Actor.named("Yefry");
	public static String Ambient = "https://www.advantageonlineshopping.com/#/";
	
	@Managed(uniqueSession = true)
	public static WebDriver driver;
}