package Data_Driven_Testing;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainAppForExcelHashMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMapCode.test();
		
		HashMap<String,String> data=HashMapCode.HashMapData;
		System.out.println(data);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		if(data.get("gender").equals("gender-male"))
			driver.findElement(By.id("gender-male")).click();
		else {
			driver.findElement(By.id("gender-female")).click();
			
			driver.findElement(By.id("FirstName")).sendKeys(data.get("FirstName"));
			driver.findElement(By.id("LastName")).sendKeys(data.get("LastName"));
			driver.findElement(By.id("Email")).sendKeys(data.get("Email_Id"));
			driver.findElement(By.id("Password")).sendKeys(data.get("Password"));
			driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get("Password"));
		}
	}

}
