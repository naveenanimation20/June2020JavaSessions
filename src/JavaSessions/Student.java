package JavaSessions;

public class Student {
	
	String name;
	int rollNum;
	String cName;
	
	public Student(String name, int rollNum, String cName) {
		this.name = name;
		this.rollNum = rollNum;
		this.cName = cName;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Rupali", 10, "fifth");
		Student s2 = new Student("Vibha", 11, "fourth");
		Student s3 = new Student("Nimpa", 12, "sixth");

		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);
		
		s1 = s2;
		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);
		
		s2 = s3;
		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);
		
		s3 = s1;
		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);

	}

}
