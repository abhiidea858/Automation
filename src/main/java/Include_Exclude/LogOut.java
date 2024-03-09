package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogOut {
	@Test
	public void logOut() {
		Reporter.log("Logout link is working ",true);
	}
	@Test
	public void verifyLogout() {
		Reporter.log("LogOut success",true);
	}
	
}
