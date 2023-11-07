package advantage.userinterface.login;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class login_POM extends PageObject{
	
	public static Target BTN_Login = Target.the("The user button").located(By.id("menuUser"));
	public static Target TXT_Username = Target.the("The input where the username is entered").located(By.name("username"));
	public static Target TXT_Password = Target.the("The input where the password is entered").located(By.name("password"));
	public static Target BTN_SingIn = Target.the("The sing in button").located(By.id("sign_in_btn"));
}