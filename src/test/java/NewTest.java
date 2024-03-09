import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method executed",true);  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After method executed",true); 
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class method executed",true); 
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("After class method executed",true); 
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before Test method executed",true); 
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After Test method executed",true); 
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before Suite method executed",true); 
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("After Suite method executed",true); 
  }

}
