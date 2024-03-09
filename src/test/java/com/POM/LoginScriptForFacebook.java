package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScriptForFacebook {
	//declaration
	private WebElement ForgetPassword;
	private WebElement UserName;
	
	//initialization   identify Elements
	public LoginScriptForFacebook(WebDriver driver) {
	ForgetPassword=driver.findElement(By.xpath(".//a[text()='Forgotten password?']"));
	UserName=driver.findElement(By.id("identify_email"));	
	}
	//utilize      perform Action
	public void ForgetAccount(String UN,String Pwd) {
		UserName.sendKeys(UN);
	}
	public void clickLogin() {
		ForgetPassword.click();
	}
	

}
