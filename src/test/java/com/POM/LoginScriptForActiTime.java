package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScriptForActiTime {
	//declaration
	private WebElement UserName;
	private WebElement Password;
	private WebElement LoginButton;
	
	//initialization
	public LoginScriptForActiTime (WebDriver driver) {
		UserName=driver.findElement(By.id("username"));
		Password=driver.findElement(By.name("pwd"));
		LoginButton=driver.findElement(By.id("loginButton"));
	}
	public void setLogin(String un,String pwd) {
		UserName.sendKeys("un");
		Password.sendKeys(pwd);
	}
	public void clickLogin() {
		LoginButton.click();
	}

}
