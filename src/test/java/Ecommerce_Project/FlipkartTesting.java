package Ecommerce_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipkartTesting {
@Test
public void searchElement() throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	//search webElement
	driver.findElement(By.name("q")).sendKeys("one plus mobile");
	//click on search icon
	driver.findElement(By.className("_2iLD__")).click();
	//select the memory
	driver.findElement.click();
	//select the product
	driver.findElement(By.xpath("(.//div[text()='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 256 GB)'])[1]")));
	
	
}
}
