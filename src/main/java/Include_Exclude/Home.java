package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Home {
	@Test
	public void homeApp() {
		Reporter.log("Home page is working fine ",true);
	}
	@Test
	public void homeVerify() {
		Reporter.log("Home page verified",true);
	}
	
	

}
