package advantage.tasks.login;

import advantage.userinterface.login.login_POM;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class login_task implements Task{
	
	private String username;
	private String password;
	
	
	private login_task(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
public static login_task Using(String username, String password) {
	
			return new login_task(username, password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(login_POM.BTN_Login),
				WaitUntil.the(login_POM.TXT_Username, isVisible()).forNoMoreThan(5).seconds(),
				Enter.theValue(username).into(login_POM.TXT_Username),				
				Enter.theValue(password).into(login_POM.TXT_Password),
				WaitUntil.the(login_POM.BTN_SingIn, isVisible()).forNoMoreThan(5).seconds(),
				Click.on(login_POM.BTN_SingIn)
				);
		
	}
	
}