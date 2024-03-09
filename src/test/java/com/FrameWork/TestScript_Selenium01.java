package com.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScript_Selenium01 {
@Test
public void testLogin() {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//Enter UserName
	driver.findElement(By.id("email")).sendKeys("Admin@123");
	//Enter password
	driver.findElement(By.id("pass")).sendKeys("Admin");
	
}
}
