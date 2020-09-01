package OOP_AbstractConcept;

public abstract class Page {
	
	public final int timeout = 10;
	//to provide constant values
	//to prevent method overriding
	//to prevent inheritance

	public Page() {
		System.out.println("Page -- const....");
	}

	// we can have abstract class constructor --it will be called when you create the object of child class
	// no method body : abstract method

	abstract public void header();

	abstract public void title();

	public static void logo() {
		System.out.println("Page -- Logo");
	}

	public void display() {
		System.out.println("Page -- display");
	}
	
	//0% abstraction: no abstract method in class
	//100% abstraction : yes 
	//0-100% partial abstraction
	

}
