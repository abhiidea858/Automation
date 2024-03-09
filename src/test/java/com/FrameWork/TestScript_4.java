package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_4 {
	public void createAccount() {
		Reporter.log("Create Acount merhod executed",true);
	}
	@Test(enabled=false)
	public void updateAccount() {
		Reporter.log("Update account method executed",true);
	}
	@Test
	public void deleteAccount() {
		Reporter.log("Delete Account Executed",true);
	}

}
