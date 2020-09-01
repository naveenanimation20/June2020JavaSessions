package JavaSessions;

public class Car {
	
	//class vars
	String name;
	String color;
	int price;
	static int wheels = 4;

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();

		c1.name = "Audi";
		c1.color = "Red";
		c1.price = 50;
		
		System.out.println(c1.name + c1.color + c1.price + Car.wheels);
		
		c2.name = "BMW";
		c2.color = "Black";
		c2.price = 55;
		
		System.out.println(c2.name + c2.color + c2.price + Car.wheels);

	}

}
