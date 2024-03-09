package TestNG_Execution;

import org.openqa.selenium.By;

public class LoginScript extends BaseScript_{
	@Test
	public void FbLogin() {
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Admin@123");
		driver.findElement(By.name("login")).submit();
	}

}
