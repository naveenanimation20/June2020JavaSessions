package JavaSessions;

public class CompTest {

	public static void main(String[] args) {

		
		Company c2 = new Company("HCL", 1900, "Noida", "HCL", "HR Policy");
		System.out.println(c2.name);
		
		System.out.println(c2.getPolicy());
		
		c2.getEmpData();
		
	}

}
