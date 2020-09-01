package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	
	public void ambulanceServices();
	
	public void cardioServices();
	
	public void emergencyServices();
	
	public void orthoServices();
	
	//no method body : abstract method
	//only method prototype
	//can not create the object of Interface
	//interface vars are static and final in nature by default
	
	//after JDK 1.8:
	//1. you can create a static method with method body 
	public static void covidTest(){
		System.out.println("US -- medical -- Covid Test");
	}
	
	//2. you can have a default method:
	default void billing(){
		System.out.println("US -- Medical -- Billing");
	}
	

}
