package com.POM;



import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FacebookLoginPage_1 {
	private WebElement emailfield;
	private WebElement passwordfield;
	private WebElement forgotfield;
	private WebElement loginButton;
	private WebElement CreatenewAccount;
	
	public FacebookLoginPage_1(WebDriver driver) {
		emailfield=driver.findElement(By.id("email"));
		passwordfield=driver.findElement(By.name("pass"));
		forgotfield=driver.findElement(By.linkText("Forgotten password?"));
		loginButton=driver.findElement(By.name("login"));
		CreatenewAccount=driver.findElement(By.linkText("Create new account"));
		
	}
	public void setLogin(String user,String pass) {
		emailfield.sendKeys(user);
		passwordfield.sendKeys(pass);
		
	}
	public void clickOnLoginButton(){
		loginButton.click();
		
	}
	public void clickOnforgotPassword() {
		forgotfield.click();
	}
	public void clickOnCreateAccount() {
		CreatenewAccount.click();
	}
}
