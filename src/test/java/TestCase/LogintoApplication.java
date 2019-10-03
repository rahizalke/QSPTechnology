package TestCase;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.relevantcodes.extentreports.LogStatus;

import testbase.Testbase;

public class LogintoApplication extends Testbase  {
	
	 @Test (dataProvider = "Data_Collection")
     //public void ReadingDataformXlsxfile(Hashtable<String, String> testData ){
     public void LogintoApplication(Hashtable<String, String> testData ) throws IOException{
				
	//@Test
	//public void LogintoApplication() throws InterruptedException{
		
		test = extent.startTest("LogintoApplication");
		 
		driver.findElement(By.linkText("Sign in")).click();
		test.log(LogStatus.PASS, "Sing in button has been clicked");
		Reporter.log("Sing in button has been clicked");//TestNg Report
		takeScreenShot();
		
		//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test.test1234@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(testData.get("Email_ID"));
		driver.findElement(By.xpath(OR.getProperty("XEmailAdd"))).sendKeys(testData.get("Email_ID"));
		test.log(LogStatus.PASS, "Email_ID has been entered");
		Reporter.log("Email_ID has been entered");
		takeScreenShot();
		
		driver.findElement(By.xpath(OR.getProperty("XCreatActBtn"))).click();
		test.log(LogStatus.PASS, "Create an account button has been clicked");
		Reporter.log("Create an account button has been clicked");
		takeScreenShot();
		
		driver.findElement(By.xpath(OR.getProperty("Xtitle"))).click();
		test.log(LogStatus.PASS, "Mr. Title has been entered");
		Reporter.log("Mr. Title has been entered");
		takeScreenShot();
		
		driver.findElement(By.xpath(OR.getProperty("Xfirstname"))).sendKeys(testData.get("First_Name"));
		test.log(LogStatus.PASS, "First_Name has been entered");
		Reporter.log("First_Name has been entered");
		takeScreenShot();
		
		driver.findElement(By.xpath(OR.getProperty("XLastname"))).sendKeys(testData.get("Last_Name"));
		test.log(LogStatus.PASS, "Last_Name has been entered");
		Reporter.log("Last_Name has been enteredd");
		takeScreenShot();
		
		driver.findElement(By.xpath(OR.getProperty("Xpwd"))).sendKeys(testData.get("Password"));
		test.log(LogStatus.PASS, "Password has been entered");
		Reporter.log("Password has been entered");
		takeScreenShot();
		
	}
	
//     @DataProvider
//     public static Object[][] Data_Collection() {
//		DataCollection dc = new DataCollection(excel, "Test_Data", "TC001_Create_an_Account2222");
//		 return dc.dataArray();
	 }
      
  
	 
	 
	 
	 
	 
	 
	
	
	
	


