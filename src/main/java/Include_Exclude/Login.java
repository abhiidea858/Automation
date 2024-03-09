package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginApp() {
		Reporter.log("Login to the App is working ",true);
	}
	@Test
	public void verifyLoginApp() {
		Reporter.log("Login App processes working ",true);
	}
}
