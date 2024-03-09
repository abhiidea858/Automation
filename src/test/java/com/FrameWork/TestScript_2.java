package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;
//depends on method
public class TestScript_2 {
	@Test
	public void signUp() {
		Reporter.log("Sign up method Executed",true);
		//fail();
	}
	@Test(dependsOnMethods="signUp")
	public void LoginPage() {
		Reporter.log("Login page Executed",true);
	}

}
