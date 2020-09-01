package ExceptionHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.AuthPopUpHandle;
import SeleniumSessions.ElementUtil;
import app.tests.BaseTest;
import app.tests.GoogleTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ThrowKeyword {

	public static void main(String[] args) {

		BaseTest bs = new BaseTest();
		GoogleTest g = new GoogleTest();
		g.setup("chrome");
		
//		try {
//			throw new Exception("NAVEENEXCEPTION");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		String br = "opera";

		if (br.equals("chrome")) {

		}
		else if (br.equals("ff")) {

		}
		else if (br.equals("ie")) {

		}
		else{
			System.out.println("plz pass the right browser name..."+ br);
			try {
				throw new Exception("NOBrowserFoundException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
