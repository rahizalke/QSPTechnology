package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import testbase.Testbase;

public class commonMethod extends Testbase {
	
	public static void clickOnWebElement(String Xpath, String webelement) throws IOException{
		try {
		driver.findElement(By.xpath(OR.getProperty(Xpath))).click();
		test.log(LogStatus.PASS, webelement+ " has been clicked ");
		takeScreenShot();
		Reporter.log(webelement+ " has been clicked");
		} catch(Throwable t) {
			
			//System.out.println("I am in exception window:-" + t.getMessage());
			test.log(LogStatus.FAIL, webelement+ " is not clicked because of:- "+ t.getMessage());
			takeScreenShot();
		}
	}
	
	public static void sendkeys(String Xpath, String data, String webelement) throws IOException{
		
		try {
		driver.findElement(By.xpath(OR.getProperty(Xpath))).sendKeys(data);
		test.log(LogStatus.PASS, webelement+ " has been Entered ");
		takeScreenShot();
		Reporter.log(webelement+ " has been Entered");
		} catch(Throwable t) {
			
			//System.out.println("I am in exception window:-" + t.getMessage());
			test.log(LogStatus.FAIL, "Unable to entr test data in  :-" +webelement+ ". Because of:- "+ t.getMessage());
			takeScreenShot();
		}
	}
	
	
	public static boolean isDisplayed(String Xpath, String webelement) {
		try {
			driver.findElement(By.xpath(OR.getProperty(Xpath))).isDisplayed();
			  return true;
		} catch (Exception e)  {
			
 	return false;
		}
		
		
	}

	
//	public static void selectDropDownByvalu(String Xpath, String value){
//	
//	Select sel = new Select(driver.findElement(By.xpath(OR.getProperty(Xpath))));
//	sel.selectByValue(value);
//	test.log(LogStatus.PASS, webelement+ " has been Entered ");
//	takeScreenShot();
//	Reporter.log(webelement+ " has been Entered");
//			
 //  }
//	
//    public static void selectDropDownByIndex(String Xpath, int Index){
//		
//	Select sel = new Select(driver.findElement(By.xpath(OR.getProperty(Xpath))));
//	sel.selectByIndex(Index);
//	test.log(LogStatus.PASS, webelement+ " has been Entered ");
//	takeScreenShot();
//	Reporter.log(webelement+ " has been Entered");
//				
//	}
//		
//	public static void selectDropDownByVisibleText(String Xpath, String Text){
//	
//	Select sel = new Select(driver.findElement(By.xpath(OR.getProperty(Xpath))));
//	sel.selectByVisibleText(Text);
//	test.log(LogStatus.PASS, webelement+ " has been Entered ");
//	takeScreenShot();
//	Reporter.log(webelement+ " has been Entered");
//				
//   }
//	
}	