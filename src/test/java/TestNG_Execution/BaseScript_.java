package TestNG_Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseScript_ {
	WebDriver driver;
	@Parameters("BrowserName")
	@BeforeClass
	public void openBrowser(String BrowserName) {
		if(BrowserName.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if(BrowserName.equals("Chrome")) {
			driver=new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void OpenApp(){
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void TestMethodExecution(ITestResult result) {
		String MethodName=result.getName();
		if(result.getStatus()==1) {
			Reporter.log(MethodName+"Execution is Pass",true);
		}else {
			Reporter.log(MethodName+"Execution is Fail",true);
		}
	}	
	@AfterClass
	public void closeBrowser() {
	driver.close();
}	
	}
	
		
	


