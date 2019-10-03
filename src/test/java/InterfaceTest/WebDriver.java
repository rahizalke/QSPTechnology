package InterfaceTest;

public interface WebDriver { //Interface is containing signature method
	
	public void get(String URL);
	public void getTitle();
	public void click();
	public void sendkeys(String testdata);
	
	public void TakesScreenshot(String path);

}
