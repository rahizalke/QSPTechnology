package com.QSPTech.ProjectName.ModuleName;

import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

public class PracticsXlsxnew {

	@Test
	public void PracticsXlsxfile(){
		
		ExcelReader excel = new ExcelReader("D:\\rahul11.Xlsx");
		
	//	excel.addSheet("Test_Case12");
		//excel.removeSheet("Test_Case12");
		excel.addColumn("Sheet1", "pass");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
