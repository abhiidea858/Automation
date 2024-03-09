package Data_Driven_Testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UtilityMainApp {
	@Test
	public void login() throws IOException {
		WebDriver driver=new FirefoxDriver();
		UtilityMethod UM=new UtilityMethod();
		driver.get(UM.getDataFromExcel("Sheet2", 0, 0));
	}

}
