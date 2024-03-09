package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usingPageFactoryScript {
	WebDriver driver;
	public  void WithPageFactoryScript(WebDriver d) {
		driver =d;
		PageFactory.initElements(driver, this);
	}
	//identify Elements
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement pass;
	
	@FindBy(xpath =".//div[text()='Login ']")
	WebElement loginButton;
	
	public void enterUserName(String user) {
		username.sendKeys(user);
	}
	public void enterpassword(String pwd) {
	    pass.sendKeys(pwd);
	    
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
