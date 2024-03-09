package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RemoveSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/RemoveSheet.xlsx";
		FileInputStream file=new FileInputStream(path);
		//open excel sheet
		Workbook wb=WorkbookFactory.create(file);
		//Remove Row
		Sheet sh =wb.getSheet("Sheet1");
		Row tgt=sh.getRow(tgt);
		//Remove cell
		Row r=sh.getRow(3);
		Cell tgt_cell=r.getCell(0);
		r.removeCell(tgt_cell);
		FileOutputStream out=FileOutputStream(path);
		wb.write(out);
		
		
		
	}

}
