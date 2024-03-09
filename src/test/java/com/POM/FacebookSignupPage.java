package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupPage {
	private  WebElement firstname;
	private  WebElement lastname;
	private  WebElement	mobilenumber;
	private  WebElement password;
	private  WebElement date;
	private  WebElement month;
	private  WebElement year;
	private  WebElement femaleoption;
	private  WebElement maleoption;
	private  WebElement customOption;
	private  WebElement signUp;
	
	public FacebookSignupPage(WebDriver driver) {
		firstname=driver.findElement(By.name("firstname"));
		lastname=driver.findElement(By.name("lastname"));
		mobilenumber=driver.findElement(By.name("reg_email__"));
		password=driver.findElement(By.id("password_step_input"));
		date=driver.findElement(By.id("day"));
		month=driver.findElement(By.id("month"));
		year=driver.findElement(By.id("year"));
		femaleoption=driver.findElement(By.xpath(".//input[@value=1]"));
		maleoption=driver.findElement(By.xpath(".//input[@value=1]"));
		customOption=driver.findElement(By.xpath(".//input[@value=2]"));
		signUp=driver.findElement(By.xpath(".//input[@value=-1]"));
		
	}
	//same daal dena hai 
	public void setName(String F_name,String L_name) {
		firstname.sendKeys(F_name);
		lastname.sendKeys(L_name);	
	}
	public void setMobileNumber(String number) {
		mobilenumber.sendKeys(number);
		
	}
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void selectDOB(String day,String monthIndex,String yearIndex) {
		Select s =new Select(date);
		s.selectByVisibleText(day);
		Select s1=new Select(month);
		s1.selectByVisibleText(monthIndex);
		Select s2=new Select(year);
		s2.selectByVisibleText(yearIndex);
	}
	public void femaleOption() {
		femaleoption.click();
	}
	public void maleOption() {
	maleoption.click();
	
}
	public void signUp() {
	signUp.click();
}
	}
