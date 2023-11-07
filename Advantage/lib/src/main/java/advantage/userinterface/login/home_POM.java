package advantage.userinterface.login;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class home_POM extends PageObject{
	public static Target LBL_UserIcon = Target.the("The user menu").located(By.id("menuUserLink"));
}