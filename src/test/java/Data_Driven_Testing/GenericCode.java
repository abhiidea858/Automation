package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericCode {
static Workbook book;
static int row;
static int cell;

public static Workbook getWorkbookData() throws IOException {
	try {
		FileInputStream file=new FileInputStream("../MAVEN_PROJECT/src/test/java/Data_Driven_Testing/GenericCode.java");
		book= WorkbookFactory.create(file);
		
	}catch(EncryptedDocumentException e) {
		
	}catch(FileNotFoundException e){
		
	}
	return book;
	
}

public static int getRow() {
	return row=book.getSheet("Sheet1").getLastRowNum();
}

public static int getCell() {
	return cell=book.getSheet("Sheet1").getRow(0).getLastCellNum();
}
}
