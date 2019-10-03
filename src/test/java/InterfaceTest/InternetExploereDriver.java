package InterfaceTest;

public class InternetExploereDriver implements WebDriver {

	  public void get(String URL) {
			
			System.out.println("InternetExploereDriver:- Navaigationg to Applaction URL Chrome Driver :-" +URL);
		}
		
		public void getTitle() {
			
			System.out.println("InternetExploereDriver:- gatting title of the Applaction page");
		}

		public void click() {
			
			System.out.println("InternetExploereDriver:- Clicking on the Webelement");
		}
		
		public void sendkeys(String testdata) {
			
			System.out.println("InternetExploereDriver:- Entering testData in to input field" + testdata);
	}

		@Override
		public void TakesScreenshot(String path) {
			// TODO Auto-generated method stub
			
		}

}
