package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {

		LoginPage obj = new LoginPage();
		obj.login();
		obj.login(9090);
		obj.login("naveen", "test@123", "nav@gmail.com");
	
	}

	// Method Overloading: within the class, when we have different methods:
	// with the same name
	// with different number of params
	// with different sequence of params
	// and this is called -- overloaded method

	public void login() { // 0 param
		System.out.println("login simple....");
	}

	public void login(int otp) { // 1 param
		System.out.println("login with OTP...." + otp);
	}

	public void login(String username, String password) { // 2 params
		System.out.println("login with username and password....");
	}

	public void login(String username, long phoneNumber) { // 2 params
		System.out.println("login with username and password....");
	}

	public void login(long phoneNumber, String username) { // 2 params
		System.out.println("login with username and password....");
	}

	public void login(String username, String password, int otp) { // 3 params
		System.out.println("login with username and password and OTP....");
	}

	public void login(String username, String password, String email) { // 3
																		// params
		System.out.println("login with username and password and email...." + username + password + email);
	}

}
