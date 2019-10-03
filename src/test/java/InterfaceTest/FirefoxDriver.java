package InterfaceTest;

public class FirefoxDriver implements WebDriver  {
	
    public void get(String URL) {
		
		System.out.println("FirefoxDriver:- Navaigationg to Applaction URL Chrome Driver :-" +URL);
	}
	
	public void getTitle() {
		
		System.out.println("FirefoxDriver:- gatting title of the Applaction page");
	}

	public void click() {
		
		System.out.println("FirefoxDriver:- Clicking on the Webelement");
	}
	
	public void sendkeys(String testdata) {
		
		System.out.println("FirefoxDriver:- Entering testData in to input field" + testdata);
}

	@Override
	public void TakesScreenshot(String path) {
		// TODO Auto-generated method stub
		
	}

	}