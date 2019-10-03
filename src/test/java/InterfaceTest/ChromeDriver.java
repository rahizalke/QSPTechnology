package InterfaceTest;

public class ChromeDriver implements WebDriver {
	
	public void get(String URL) {
		
		System.out.println("ChromeDriver:- Navaigationg to Applaction URL Chrome Driver :-" +URL);
	}
	
	public void getTitle() {
		
		System.out.println("ChromeDriver:- gatting title of the Applaction page");
	}

	public void click() {
		
		System.out.println("ChromeDriver:- Clicking on the Webelement");
	}
	
	public void sendkeys(String testdata) {
		
		System.out.println("ChromeDriver:- Entering testData in to input field" + testdata);
	}

	@Override
	public void TakesScreenshot(String path) {
		// TODO Auto-generated method stub
		
	}
}
