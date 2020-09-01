package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		
		int num = 1;
		
		switch (num) {
		
		case 1:
			System.out.println("hii");
			break;
		case 2:
			System.out.println("hello");
			break;
		case 10:
			System.out.println("bye");
			break;

		default:
			System.out.println("not found...");
			break;
		}
		
		
		String browser = "opera";
		
//		switch (browser) {
//		case "chrome":
//			System.out.println("launch chrome");
//			break;
//		case "firefox":
//			System.out.println("launch firefox");
//			break;
//		case "safari":
//			System.out.println("launch safari");
//			break;
//
//		default:
//			System.out.println("brower is not found..." + browser);
//			break;
//		}
		
		launchBrowser("chrome");
		
	}
	
	
	public static void launchBrowser(String browser){
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("brower is not found..." + browser);
			break;
		}
	}

}
