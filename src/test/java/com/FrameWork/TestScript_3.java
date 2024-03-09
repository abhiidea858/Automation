package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_3 {
	@Test(groups="Sample")
	public void m1() {
		Reporter.log("M1 method is executed ",true);
	}
	@Test(groups="sample")
	public void m2() {
		Reporter.log("M2 method is executed ",true);
	}
	@Test(groups="sample")
	public void m3() {
		Reporter.log("M3 method is executed ",true);
}
	@Test(groups="sample")
	public void m4() {
		Reporter.log("M4 method is executed ",true);
}
	@Test(dependsOnGroups="sample")
	public void m5() {
		Reporter.log("m5 method is executed",true);
	}
}
