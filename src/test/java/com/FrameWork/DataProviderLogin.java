package com.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin {
	@DataProvider
	public Object[][]TestData(){
		Object [][] obj=new Object[0][1];
		obj[0][0]="Admin@123";
		obj[0][1]="Admin123";
		return obj;
	}
	@Test(dataProvider = "TestData")
	public void TestLogin(String email, String pass) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Enter UserName
		driver.findElement(By.id("email")).sendKeys(email);
		//Enter password
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		

	}
	

}
