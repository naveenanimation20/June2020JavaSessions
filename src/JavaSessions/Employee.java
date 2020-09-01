package JavaSessions;

import java.util.ArrayList;

public class Employee {
	//class vars:
	String name;
	int age;
	int EmpId;
	double salary;
	boolean isPermanent;
	String role;
	String compName;
	ArrayList<String> deviceList;
	
	//you can create the const..  with all class vars or with partial class vars:
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, int EmpId){
		this.name = name;
		this.age = age;
		this.EmpId = EmpId;
	}
	
	public Employee(String name, double salary, String role) {
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	
	//with all class vars:
	public Employee(String name, int age, int EmpId, double salary, 
			boolean isPermanent, String role, String compName, ArrayList<String> deviceList) {
		this.name = name;
		this.age = age;
		this.EmpId = EmpId;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.role = role;
		this.compName = compName;
		this.deviceList = deviceList;
	}
	
	
	public Employee(String name, int EmpId, ArrayList<String> deviceList) {
		this.name = name;
		this.EmpId = EmpId;
		this.deviceList = deviceList;
	}

	//constructor can be overloaded
	public Employee(){//0 param -- default const...
		System.out.println("default const....");
	}
	
	public Employee(int i){//1 param const...
		System.out.println("1 param const..." + i);
	}
	
	public Employee(int i, String s){//1 param const...
		System.out.println("2 param const..." + i+ s);
	}
	
	
	
	public static void main(String[] args) {

//		Employee e1 = new Employee(10, "test");
//		Employee e2 = new Employee(10);
		ArrayList<String> devList = new ArrayList<String>();
		devList.add("Macbook pro 16 inches");
		devList.add("Apple iPhone x");
		devList.add("Android Samsung 10");

		Employee e1 = new Employee("Tom",25, 101);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.EmpId);
		
		Employee e2 = new Employee("Peter",24, 102, 34.44, true, "SDET1", "IBM", devList);
		System.out.println(e2.name+" " +e2.age + " " + e2.salary + " " + e2.deviceList);
		System.out.println(e2.deviceList.get(0));
		

		Employee e3 = new Employee("Priyanka", 103, devList);
		System.out.println(e3.name);
		System.out.println(e3.EmpId);
		System.out.println(e3.deviceList.size());
		
	}
	
	

}
