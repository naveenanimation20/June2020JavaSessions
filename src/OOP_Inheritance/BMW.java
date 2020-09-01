package OOP_Inheritance;

public class BMW extends Car{
	
	//Method Overriding -- when we have a method in parent class and the same method is in child class with:
	//the same name
	//and same number of params
	//overridden method
	
	@Override
	public void start(){
		System.out.println("BMW -- start");
	}
	
	public void autoParking(){
		System.out.println("BMW -- autoparking");
	}
	
	public static void display(){
		System.out.println("BMW -- display");
	}
	
	

}
