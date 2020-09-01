package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		
		try{
		obj.getName();
		}
		catch(ArithmeticException e){
			
		}
	}

	public void getName() throws ArithmeticException{
		getCity();
	}

	public void getCity() throws ArithmeticException{
		getAddress();
	}

	public void getAddress() throws ArithmeticException{
		System.out.println("getAddress");
		int i = 9/0;
	}

}
