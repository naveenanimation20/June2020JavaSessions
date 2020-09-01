package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden method
		b.stop();//inherited method
		b.refuel();//inherited method
		b.autoParking();//child class method
		b.engine();
		BMW.display();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.display();
		
		//Top Casting:
		Car c1 = new BMW();//child class object can be referred by parent class reference variable...
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		//down casting:
		//BMW b1 = (BMW) new Car();//ClassCastException: OOP_Inheritance.Car cannot be cast to OOP_Inheritance.BMW
		//Run time exception 
		//b1.start();
		
		//BMW b2 = (BMW) new Vehicle();
		
	}

}
