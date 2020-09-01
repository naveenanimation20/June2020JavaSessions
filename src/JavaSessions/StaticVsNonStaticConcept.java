package JavaSessions;

public class StaticVsNonStaticConcept {
	//class variable
	String name;
	static int age;

	public static void main(String[] args) {

		//how to access non static vars and methods:
		//create the object of the class:
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		StaticVsNonStaticConcept obj1 = new StaticVsNonStaticConcept();
		StaticVsNonStaticConcept obj2 = new StaticVsNonStaticConcept();
		StaticVsNonStaticConcept obj3 = new StaticVsNonStaticConcept();

		obj.name = "Tom";
		System.out.println(obj.name);
		
		obj.getName();
		
		//how to call static vars and methods:
		//1. direct calling : no need to create the obejct
		age = 25;
		System.out.println(age);
		getValue();
		
		//2. call by class name:
		System.out.println(StaticVsNonStaticConcept.age);
		StaticVsNonStaticConcept.getValue();
		
		//3. can we use object to call static stuff?
		System.out.println(obj.age);
		obj.getValue();
		
	}
	
	public static void getValue(){
		System.out.println("get value...");
	}
	
	public void getName(){
		System.out.println("get Name...");
	}
	
	
	

}
