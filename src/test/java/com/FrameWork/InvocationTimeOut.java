package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationTimeOut {
	
@Test(invocationTimeOut=2000)

public void signUp() throws InterruptedException {
	Thread.sleep(4000);
	Reporter.log("SignUp Method Executed");
	
}
}
