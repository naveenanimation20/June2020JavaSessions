package OOP_AbstractConcept;

public class IciciBankTest {

	public static void main(String[] args) {
		
		
		final int i = 10;

		LoginPage lp = new LoginPage();
		
		lp.header();
		lp.title();
		lp.display();
		lp.doLogin("admin", "admin123");
		System.out.println(lp.timeout);
		
		//top casting: child class object can be referred by parent abstract class ref variable:
		Page p = new LoginPage();
		p.header();
		p.title();
		p.display();
		System.out.println(p.timeout);

		
		
	}

}
