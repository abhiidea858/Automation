package com.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Suite {
	@Parameters
	@Test
	public void Login(String email,String pwd) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Enter UserName
		driver.findElement(By.id("email")).sendKeys(email);
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Reporter.log(email,true);
		Reporter.log(pwd,true);
		
	}

}
