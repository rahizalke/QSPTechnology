package InterfaceTest;

public class Testinterface {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
	driver = new ChromeDriver();	
	driver = new FirefoxDriver();	
	driver = new InternetExploereDriver();
	
	driver = new ChromeDriver();	

	driver.get("www.gmail.com");
	driver.getTitle();
	driver.sendkeys("Rahul");
	driver.click();

	}

	
}
