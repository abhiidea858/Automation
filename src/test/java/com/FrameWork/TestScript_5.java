package com.FrameWork;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_5 {
	@Test
	public void signUp() {
		Reporter.log("SignUp method Executed");
		fail();
	}
	@Test(dependsOnMethods="signUp",alwaysRun=true)
	public void loginPage() {
		Reporter.log("Login page Executed",true);
	}

}
