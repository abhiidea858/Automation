package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeMainLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://online.actitime.com/test26/login.do");
		LoginScriptForActiTime_1 page=new LoginScriptForActiTime_1(driver);
		page.setLogin("Admin@123gmail.com","Manager");
		page.clickOnLOgin();
		String text=page.getErrorMsg();
		System.out.println(text);
	}

}
