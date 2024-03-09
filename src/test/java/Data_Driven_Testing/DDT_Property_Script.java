package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDT_Property_Script {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("../MAVEN_PROJECT/DDT_Property");
				//open file
			Properties p =new Properties();
		p.load(file);
		//Read data
		String url=p.getProperty("URL");
		//open Browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open url
		driver.get(url);
		//enter username
		String username=p.getProperty("un");
		driver.findElement(By.name("username")).sendKeys(username);
		//Enter password
		String pass=p.getProperty("PWD");
		driver.findElement(By.name("password")).sendKeys(pass);
		//click on login button
		driver.findElement(By.xpath(".//button[text()=' Login ']")).click();
		//verify login page
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Orange HRM"));
		System.out.println("Home page is displayed");
		
		
	}

}
