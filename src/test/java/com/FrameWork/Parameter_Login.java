package com.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Login {
	@Parameters({"email","pwd"})
	@Test
	public void Login (String email,String password) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		//Enter UserName
		driver.findElement(By.id("email")).sendKeys(email);
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys();
		
	}

}
