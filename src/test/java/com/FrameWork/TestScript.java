package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript {
	@Test(invocationCount=10)
	public void createAccount() {
		Reporter.log("Create Account Method Executed",true);
	}

}
