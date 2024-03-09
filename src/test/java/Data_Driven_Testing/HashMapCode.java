package Data_Driven_Testing;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Workbook;

public class HashMapCode {
	public static HashMap<String,String> HashMapData;
	public static void test() throws IOException {
		HashMapData=new HashMap<String,String>();
		Workbook book=GenericCode.getWorkbookData();
		int row=GenericCode.getRow();
		int cell=GenericCode.getCell();
		System.out.println(cell+"\t"+row);
		
		//for rows
		for(int i=0;i<=row;i++) {
			String key=null,value=null;
			int j=0;
			key=book.getSheet("Sheet1").getRow(i).getCell(j).toString();
			
			for(;j<cell;j++) {
				value=book.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
			HashMapData.put(key, value);
		}
		
	}
		
	

}
