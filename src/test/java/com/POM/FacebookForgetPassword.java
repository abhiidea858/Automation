package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookForgetPassword {
	private WebElement  emailfield;
	private WebElement cancelbutton;
	private WebElement searchfield;
	
	public FacebookForgetPassword(WebDriver driver) {
		emailfield=driver.findElement(By.id("identify_email"));
		cancelbutton=driver.findElement(By.linkText("Cancel"));
		 searchfield=driver.findElement(By.linkText("Search"));
		 
	}
	public void setEmail(String email) {
		emailfield.sendKeys(email);
		
	}
	public void clickOnSearchButton() {
		searchfield.click();
	}
	public void clickOnCancelButton() {
		cancelbutton.click();
	}
}
