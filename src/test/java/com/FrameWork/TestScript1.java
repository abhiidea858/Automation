package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 {
	@Test(priority=5)
	public void createAccount() {
		Reporter.log("Create Account Method Executed",true);
		}
	
	public void updateAccount() {
		Reporter.log("Update Account method Executed",true);
	}
	public void DeleteAccount() {
		Reporter.log("Delete account method Executed",true);
	}
	@Test(priority=2)
	public void ReadAccount() {
		Reporter.log("Read Account method Executed",true);
	}
	@Test(priority=1)
	public void editAccount() {
		Reporter.log("Edit Account method Executed",true);
	}

}
