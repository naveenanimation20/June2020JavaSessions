package WebDriverArch;

public class GoogleTest {
	public static WebDriver driver;

	public static void main(String[] args) {

		String browser = "firefox";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("http://www.google.com");
		driver.findElement("search");
		driver.quit();

	}

}
