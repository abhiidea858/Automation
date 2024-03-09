package Data_Driven_Testing;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;
public class HashMapWithSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,String> ref=new HashMap<>();
		//to add data in hashMap we use put Method
		ref.put("URL", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref.put("username", "Admin");
		ref.put("password","Admin123");
		//open browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String Url=ref.get("URL");
		driver.get(Url);
		//enter UserName
		String un=ref.get("username");
		driver.findElement(By.name("username")).sendKeys(un);
		//Enter password
		String pass=ref.get("password");
		driver.findElement(By.name("password")).sendKeys(pass);
		//click on login button
		driver.findElement(By.xpath(".//button[text()=' Login ']")).click();
		//create new HashMap
		HashMap<String,String> ref1=new HashMap<>();
		//to add data in HashMap We use put method
		ref1.put("URL","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
		ref1.put("username","Admin");
		ref1.put("password","Admin123");
	}

}
