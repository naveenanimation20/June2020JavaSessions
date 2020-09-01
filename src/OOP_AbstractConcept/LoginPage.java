package OOP_AbstractConcept;

public class LoginPage extends Page {

	public LoginPage(){
		System.out.println("LP -- const....");
	}
	
	@Override
	public void header() {
		System.out.println("LP -- header");
	}

	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	public void doLogin(){
		System.out.println("LP -- do login");
	}

	public void doLogin(String un, String pwd){
		System.out.println("LP -- do login with " + un + pwd);
	}
	

}
