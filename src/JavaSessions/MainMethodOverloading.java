package JavaSessions;

public class MainMethodOverloading {

	public static void main(String ar[]) {
		System.out.println("Main Method....");
		
		main(10);
	}
	
	
	public static void main(int i) {
		System.out.println("Main Method...." + i);	
	}
	
	
	public static void main(int i, int j) {
		System.out.println("Main Method...." + i+j);	
	}
	
	public static void main(String str) {
		System.out.println("Main Method...." + str);	
	}
	
	
}
