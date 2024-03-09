package com.FrameWork;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerClass implements ITestListener{
	public void onStart(ITestContext result) {
		Reporter.log("On Start method invoked.......",true);
	}
	public void onFinish(ITestContext result) {
		Reporter.log("On finish method invoked.....",true);
		
	}
	//When Test Case is Failed This method is called 
	public void onTestFailure(ITestResult result) {
		Reporter.log("Name Of the test method Failed"+result.getName(),true);
	}
	//When Test case get Skipped This method is called 
	public void onTestSkipped(ITestResult,result) {
		Reporter.log("Name of the test method Skipped"+result.getName(),true);
	}
	//When Test case get Started, this method is called
	public void onTestStart(ITestResult result) {
		Reporter.log("Name of the test Method Started"+result.getName(),true);
		
	}
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Name of the tesrt method success");
	}

}
