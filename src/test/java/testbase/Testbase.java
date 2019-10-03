package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testbase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	// public static ExcelReader excel = new
	// ExcelReader("D:\\rahul\\qsp\\MavenProject\\src\\test\\resources\\tastData\\Master_Sheet.xlsx");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\tastData\\Master_Sheet.xlsx");
	static String testCaseName;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static Hashtable<String, String> testCaseRunMode = new Hashtable<String, String>();

	@BeforeSuite
	 //@BeforeMethod
	public static void LoadingFiles() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\config.properties");
		config.load(fis);
		System.out.println("***************Config file as been loaded***************");

		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\OR_properties");
		OR.load(fis1);
		System.out.println("*************** OR file as been loaded***************");

		String TimeStamp = new SimpleDateFormat("yy.MM.DD.mm.ss").format(new Date());
		extent = new ExtentReports(System.getProperty("user.dir") + "\\src\\test\\resources\\extentReport\\"
				+ "ExecutionReport_"+TimeStamp+".html");

		loadHashTable(testCaseRunMode, "Test_Cases", "TestCaseName", "Run_Mode");

	}

   // @BeforeMethod
	public static void launchingBrowser() {

		if (config.getProperty("Browsers").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\rahul\\qsp\\MavenProject\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (config.getProperty("Browsers").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\rahul\\qsp\\MavenProject\\src\\test\\resources\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(config.getProperty("Application_URL")); //dynamic
		System.out.println("Browser has been launched and user redirected Applaction URL");
		
		//test.log(LogStatus.INFO, config.getProperty("Application_URL"));
        // test.log(LogStatus.INFO, "Browser has been launched and user redirected Applaction URL :-" + config.getProperty("Application_URL"));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		test = extent.startTest("testCaseName");
	}
	 
	public static void takeScreenShot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String TimeStamp = new SimpleDateFormat("yy.MM.DD.mm.ss").format(new Date());
		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
				+ "\\src\\test\\resources\\screenShots\\screenShot_" + TimeStamp + ".png";

		File destFile = new File(reportDirectory);

		FileHandler.copy(scrFile, destFile);
		test.log(LogStatus.PASS, test.addScreenCapture(reportDirectory));

		//Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src'" + destFile.getAbsolutePath()
			//	+ "' hight='100' widh='100'/> </a>");

	}
	
	public static void loadHashTable(Hashtable<String, String> testCaseRunMode, String SheetName, String KeyCol, String valueCol) {
			

		int row = excel.getRowCount(SheetName);

		for (int i = 2; i <=row; i++) {

			String key = excel.getCellData(SheetName, KeyCol, i);

			String val = excel.getCellData(SheetName, valueCol, i);

			testCaseRunMode.put(key, val);
		}

		System.out.println("testCaseRunMode");
	
	}

	public static boolean isExecutable(String TC_name) {

		testCaseName = TC_name;

		if (testCaseRunMode.get(testCaseName).equalsIgnoreCase("Y")) {
			// skip="NO" ;
			return true;
		} else {
			// skip="Yes" ;
			return false;

		}

	}

	// @AfterSuite
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}

	@AfterSuite(alwaysRun = true)
	public static void writeIntoExtentReport() {
		extent.endTest(test);
		extent.flush();

	}
	
	public static void passLogStatus(String message) throws IOException {
		
        test.log(LogStatus.PASS, message);		
		takeScreenShot();
	}
	

	@DataProvider
	public static Object[][] Data_Collection() {
		DataCollection dc = new DataCollection(excel, "Test_Data", "TC001_Create_an_Account");
		return dc.dataArray();

	}

}