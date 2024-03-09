package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelSheet_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="C:/Users/Abhimanyu Prasad/eclipse-workspace/MAVEN_PROJECT/ExcelSheet_1.xlsx";
		//copy from ROM to RAM
		FileInputStream file=new FileInputStream(path);
				//open excel
				Workbook wb=WorkbookFactory.create(file);
		//open sheet
		Sheet sh=wb.getSheet("sheet1");
		//identify row
		Row r=sh.getRow(0);
		//Identify cell
	org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
	//identify cell data
	String data=c.getStringCellValue();
	System.out.println(data);
	
	CellType dataType=c.getCellType();
	if(dataType==CellType.STRING) {
		String data1=c.getStringCellValue();
		System.out.println(data1);
	}else {
		String data1=c.getStringCellValue();
		System.out.println(data1);
		
		
		//total rows used in a sheet
		int rowcount=sh.getLastRowNum();
		System.out.println(rowcount);
		//total cell used in a row 
		short cellcount=sh.getRow(0).getLastCellNum();
		System.out.println(cellcount);
	}
				
				
	}

}
