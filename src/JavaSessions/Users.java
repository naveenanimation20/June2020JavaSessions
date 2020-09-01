package JavaSessions;

public class Users {
	
	String name;
	int age;

	public Users(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public static void main(String[] args) {

		Users u1 = new Users("Tom", 25);
		Users u2 = new Users("Peter", 35);
		
		System.out.println(u1.name + " " + u1.age);
		u1 = null;
		u1 = u2;
		System.out.println(u1.name + " " + u1.age);//NullPointerException
		System.out.println(u2.name + " " + u2.age);


	}

}
