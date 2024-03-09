package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		LoginScriptForActiTime page=new LoginScriptForActiTime(driver);
		page.setLogin("Admin@124gmail.com","Manager");

	}

}
