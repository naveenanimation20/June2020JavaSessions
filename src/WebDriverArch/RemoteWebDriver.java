package WebDriverArch;

public class RemoteWebDriver implements WebDriver {

	@Override
	public void get(String url) {
		System.out.println("launch url: " + url);
	}

	@Override
	public void quit() {
		System.out.println("quit the browser");
	}

	@Override
	public void findElement(String element) {
		System.out.println("find the element..." + element);
	}

}
