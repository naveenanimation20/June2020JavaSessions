package JavaSessions;

public class Person {
	//class variables
	String name;
	int age;
	double weight;
	char gender;
	String dob;

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Naveen";
		p1.age = 15;
		p1.weight = 60;
		p1.gender = 'm';
		p1.dob = "12-12-2005";
		
		
		Person p2 = new Person();
		p2.name = "Preethi";
		p2.age = 45;
		p2.weight = 70;
		p2.gender = 'f';
		p2.dob = "12-12-1975";
		
		Person p3 = new Person();
		p3.name = "Janak";
		p3.weight = 110;
		
		Person p4 = new Person();
		
		new Person().name = "Tom";
		new Person().age = 25;

		
		System.out.println(p1.name + " " + p1.age + " " + p1.weight + " " + p1.gender + " " + p1.dob);
		System.out.println(p2.name + " " + p2.age + " " + p2.weight + " " + p2.gender + " " + p2.dob);
		System.out.println(p3.name + " " + p3.age + " " + p3.weight + " " + p3.gender + " " + p3.dob);

		System.out.println(p4.name + " " + p4.age + " " + p4.weight + " " + p4.gender + " " + p4.dob);

		
	}

}
