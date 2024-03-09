package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {
	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream file=new FileInputStream("../MAVEN_PROJECT/DDT_Property");
		Properties p =new Properties();
		p.load(file);
		return p.getProperty(key);
		}
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws IOException {
		FileInputStream file=new FileInputStream("../MAVEN_PROJECT/ExcelWithSelenium.xlsx");
		Workbook book=null;
		try {
			book=WorkbookFactory.create(file);
			
		}catch(EncryptedDocumentException e) {
			
		}
		Sheet sh=book.getSheet(sheetname);
		return sh.getRow(rownum).getCell(cellnum).toString();
	}

}
