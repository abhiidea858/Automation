package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch {
	@Test
	public void launchApp() {
		Reporter.log("Launch is working Fine ",true);
		
	}
	@Test
	public void launchVerify() {
		Reporter.log("Launch URL is working ",true);
	}

}
