package JavaSessions;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser....");
		OSCompatibility();
		System.out.println("browser launched....");

	}

	private void OSCompatibility() {
		System.out.println("checking OS compa.....");

		OSFreeSpaceRAM();
	}

	private void OSFreeSpaceRAM() {
		System.out.println("checking OS Free RAM space....");
		BrowserVersion();
	}

	private void BrowserVersion() {
		System.out.println("checking br version....");
	}

}
