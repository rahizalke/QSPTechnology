package TestCase;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commonMethods.commonMethod;
import pages.Create_An_Account;
import pages.HomePage;
import testbase.Testbase;

public class TC001_Create_an_Account extends Testbase {
	
	
	//@BeforeTest
	@BeforeClass
	public static void isSkip(){
		
		if(!isExecutable("TC001_Create_an_Account"))  //true
		throw new SkipException("Skipping Test case as it's Run Mode is set to N");	
		
	}
	
	

	//@Test(dataProvider = "Data_Collection")
    public static void loadHashTable(Hashtable<String, String> testData) {
    	System.out.println("Loading HashTable with Test cases");
    }

	
	@Test (dataProvider = "Data_Collection")
    //public void ReadingDataformXlsxfile(Hashtable<String, String> testData ){
    public void TC001_Create_An_Account(Hashtable<String, String> testData ) throws IOException, InterruptedException{
				
	//@Test
	//public void LogintoApplication() throws InterruptedException{
		
		//test = extent.startTest("TC001_Create_an_Account");
		launchingBrowser();
		
		HomePage.createAnAccount(testData);                        
		
		//commonMethod.clickOnWebElement("XsingBtn", "Sign in");
		 
		//driver.findElement(By.linkText("Sign in")).click();
		//test.log(LogStatus.PASS, "Sing in button has been clicked");
		//Reporter.log("Sing in button has been clicked");//TestNg Report
		//takeScreenShot();
		
		//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test.test1234@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(testData.get("Email_ID"));
		
		//commonMethod.sendkeys("XEmailAdd", testData.get("Email_ID"), "Email_ID");
		
		//driver.findElement(By.xpath(OR.getProperty("XEmailAdd"))).sendKeys(testData.get("Email_ID"));
		//test.log(LogStatus.PASS, "Email_ID has been entered");
		//Reporter.log("Email_ID has been entered");
		//takeScreenShot();
		
		//commonMethod.clickOnWebElement("XCreatActBtn", "Create an account button");
		
	    //driver.findElement(By.xpath(OR.getProperty("XCreatActBtn"))).click();
		//test.log(LogStatus.PASS, "Create an account button has been clicked");
		//Reporter.log("Create an account button has been clicked");
		//takeScreenShot();
		
		//Create_An_Account.enterPersonalInformation();
		
		commonMethod.clickOnWebElement("Xtitle", "Title");
		
		//driver.findElement(By.xpath(OR.getProperty("Xtitle"))).click();
		//test.log(LogStatus.PASS, "Mr. Title has been entered");
		//Reporter.log("Mr. Title has been entered");
		//takeScreenShot();
		
		commonMethod.sendkeys("Xfirstname", testData.get("First_Name"), "First_Name");
		
		//driver.findElement(By.xpath(OR.getProperty("Xfirstname"))).sendKeys(testData.get("First_Name"));
		//test.log(LogStatus.PASS, "First_Name has been entered");
		//Reporter.log("First_Name has been entered");
		//takeScreenShot();
		
		commonMethod.sendkeys("XLastname", testData.get("Last_Name"), "Last_Name");
		
		//driver.findElement(By.xpath(OR.getProperty("XLastname"))).sendKeys(testData.get("Last_Name"));
		//test.log(LogStatus.PASS, "Last_Name has been entered");
		//Reporter.log("Last_Name has been enteredd");
		//takeScreenShot();
		
		commonMethod.sendkeys("Xpwd", testData.get("Password"), "Password");
		
		//driver.findElement(By.xpath(OR.getProperty("Xpwd"))).sendKeys(testData.get("Password"));
		//test.log(LogStatus.PASS, "Password has been entered");
		//Reporter.log("Password has been entered");
		//takeScreenShot();
		
		closeBrowser();
	}
	
}
//    @DataProvider
//    public static Object[][] Data_Collection() {
//		DataCollection dc = new DataCollection(excel, "Test_Data", "TC001_Create_an_Account2222");
//		 return dc.dataArray();
//	 }
     
 
	 
	 
	 
	 
	
	
	


