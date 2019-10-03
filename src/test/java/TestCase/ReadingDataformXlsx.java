package TestCase;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

public class ReadingDataformXlsx {
	
	//@Test
	//public void ReadingDataformXlsxfile(){
		
	//	ExcelReader excel = new ExcelReader("D:\\Master_Sheet.xlsx");
		
		//excel.addSheet("TestSheet12345");
		
	//	excel.removeSheet("TestSheet12345");
	     
		//excel.addColumn("Test_Cases", "comments");
		
//		System.out.println(excel.isSheetExist("Test_Data"));
//		
//		System.out.println(excel.getCellData("Test_Cases", 1, 4));
//		System.out.println(excel.getCellData("Test_Cases", 2, 6));
		
//		excel.setCellData("Test_Cases", "comments", 4, "Good Work");
//		
//		excel.setCellData("Test_Cases", "comments", 3, "Good Job");
		
	//}

//}
		
//	//	@Test
//		public void hashTable(){
//			
//			Hashtable<String, String> htdata = new  Hashtable<String, String>();
//			
//			htdata.put("FristName", "Rahul");
//			htdata.put("FristName1", "Shital");
//			htdata.put("FristName2", "Rahi");
//			htdata.put("FristName3", "priyanka");
//			
//			System.out.println(htdata.get("FristName1"));
//			System.out.println(htdata.get("FristName"));
//			System.out.println(htdata.get("FristName3"));
//			System.out.println(htdata.get("FristName2"));
//			
//		}		
//		}
//		
		
	      static ExcelReader excel = new ExcelReader("D:\\Master_Sheet.xlsx");
	      
          @Test (dataProvider = "Data_Collection")
          public void ReadingDataformXlsxfile(Hashtable<String, String> htdata ){
        	  
        	  System.out.println("Gatting data from xlsx using DataProvider" +htdata.get("First_Name"));
          }
          
          @DataProvider
          public static Object[][] Data_Collection() {
          DataCollection dc = new DataCollection(excel, "Test_Data", "TC001_Create_an_Account2");  
          return dc.dataArray();  
        	  
        	  
          }
        	  
        	
          
        	  
          }
	
		
