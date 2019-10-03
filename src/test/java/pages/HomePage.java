package pages;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import commonMethods.commonMethod;
import testbase.Testbase;

public class HomePage extends Testbase {
	
	public static void createAnAccount(Hashtable<String, String> testData) throws IOException{
		
		String Actual_title = driver.getTitle();
		
		Assert.assertEquals(Actual_title, "My Store");
		//test.log(LogStatus.PASS, "User as been redirected to the " + Actual_title + " Applaction.");
		passLogStatus("User as been redirected to the " + Actual_title + " Applaction.");
		
		commonMethod.clickOnWebElement("XsingBtn", "Sign in");
		
		boolean result = commonMethod.isDisplayed("XCreatActBtn", "Create an account button");
		Assert.assertEquals(result, true);
		passLogStatus("Create an account sections has been displayed");
		
		
		commonMethod.sendkeys("XEmailAdd", testData.get("Email_ID"), "Email_ID");
		
		commonMethod.clickOnWebElement("XCreatActBtn", "Create an account button");
		
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
		passLogStatus("User as been redirected to the Login - My Store page.");
			
	}
     	
	public static void loginWithRegisterdCredentials(){
		
		
	}
	
	public static void contactCustmerCare(){
		
	}

	
		
}

