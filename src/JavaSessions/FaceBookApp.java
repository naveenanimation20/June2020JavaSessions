package JavaSessions;

public class FaceBookApp {

	public static void main(String[] args) {

		
		LoginFeature lp = new LoginFeature("admin@gmail.com", "admin123");
		
//		lp.setUsername("naveen@gmail.com");
		lp.setPassword("Test1234555");
		
		System.out.println(lp.getUsername());
		System.out.println(lp.getPassword());
		
//		lp.setUsername("seller@gmail.com");
//		lp.setPassword("test@1234");
		
//		System.out.println(lp.getUsername());
//		System.out.println(lp.getPassword());
	}

}
