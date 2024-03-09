package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PARAMETER {
	@Parameters({"UN","PWD"})
	@Test
	public void signUp(String UN,String PWD) {
		Reporter.log(UN,true);
		Reporter.log(PWD,true);
	}

}
