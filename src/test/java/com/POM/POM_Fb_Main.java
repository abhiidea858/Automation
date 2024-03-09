package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class POM_Fb_Main {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FacebookLoginPage_1 page=new FacebookLoginPage_1(driver);
		page.setLogin("Admin@1234","Manager");
		page.clickOnLoginButton();
		page.clickOnCreateAccount();
	}
	public class TestAccount{
		@Test
		public void TestLogin() {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			FacebookLoginPage_1 page=new FacebookLoginPage_1(driver);
			page.clickOnCreateAccount();
			FacebookSignupPage page1=new FacebookSignupPage(driver);
			page1.setName("Admin", "Manager");
			page1.setMobileNumber("Admin@gmail.com");
			page1.setpassword("Manager12");
			page1.selectDOB("6","oct","1996");
			
		}
		
		
	}
	
		
	}


