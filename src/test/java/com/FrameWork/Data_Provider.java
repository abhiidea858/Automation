package com.FrameWork;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test
	@DataProvider
	public  Object[][] data(){
		Object[][] obj=new Object[2][2]; 
		obj[0][0]="Admin1";
		obj[0][1]="Manager1";
		obj[1][0]="Admin2";
		obj[1][1]="manager2";
		return obj;
	}
	@Test(dataProvider="data")
	public void signUp(String UN,String PWD) {
		Reporter.log(UN,true);
		Reporter.log(PWD,true);
		
	}

}
