package com.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class FbLogin {
	@Test
	public void login() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//To login
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin123");
		//click on login button
		driver.findElement(By.xpath(".//button[text()='Log in']")).submit();
		Assert.assertEquals(driver.getTitle(),"Facebook login orSignup");
	}
	@Test
	public void testFail() {
		Reporter.log("Failed Test case",true);
		Assert.assertTrue(false);
	}
	@Test
	public void testSkipped() {
		Reporter.log("Skipped Test case",true);
		//Execution Thrown using throw new 
		throw new SkipException("Skipped Execution Thrown.........");
	}
	

}
