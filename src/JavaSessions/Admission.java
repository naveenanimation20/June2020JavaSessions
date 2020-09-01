package JavaSessions;

public class Admission {

	public static void main(String[] args) {

		College c1 = new College();
		
		c1.setName("IIM B");
		c1.setStudentCount(1000);
		c1.setGrades("AA");
		c1.setLogo("IIM");
		
		System.out.println(c1.getName());
		System.out.println(c1.getStudentCount());
		System.out.println(c1.getGrades());
		System.out.println(c1.getLogo());
	}

}
