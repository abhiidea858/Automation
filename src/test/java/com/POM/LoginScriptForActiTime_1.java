package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScriptForActiTime_1 {
	//Declaration
	private WebElement userName;
	private WebElement passWord;
	private WebElement loginButton;
	private WebElement errormsg;
	
	//initialization          identify Element
	public LoginScriptForActiTime_1(WebDriver driver) {
		userName=driver.findElement(By.name("username"));
		passWord=driver.findElement(By.name("pwd"));
		loginButton=driver.findElement(By.id("loginButton"));
		errormsg=driver.findElement(By.xpath(".//span[text()='Username or Password is invalid. Please try again.']"));
	}
	public void setLogin(String un,String pwd) {
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
	}
	public void clickOnLOgin() {
		loginButton.click();
	}
	public String getErrorMsg() {
		return errormsg.getText();
	}

}
