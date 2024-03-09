package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelWithSelenium {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("..\"C:\\Users\\Abhimanyu Prasad\\eclipse-workspace\\MAVEN_PROJECT\\ExcelWithSelenium.xlsx\"");
		Workbook wb=WorkbookFactory.create(file);
		Sheet s =wb.getSheet("Sheet1");
		String EmailId=s.getRow(1).getCell(0).toString();
		//selenium code
		WebDriver driver=new FirefoxDriver();
		driver.get("https://online.actitime.com/test26/login.do");
		driver.findElement(By.name("username")).sendKeys(EmailId);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
	}

}
