package ExceptionHandling;

public class TryCatchConcept {

	public static void main(String[] args) {

		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");

		try{
			System.out.println("testing....");
			int i = 9/0;
			System.out.println("hello...");
			System.out.println("hello...");
			System.out.println("hello...");

		}
		catch(Exception e){
			System.out.println("some exception is coming....");
			//e.printStackTrace();
		}
		
		System.out.println("AA");
		System.out.println("AA");

		
		TryCatchConcept obj = new TryCatchConcept();
		//obj=null;
		try{
			//obj.getName();
		}
		catch(NullPointerException e){
			System.out.println("obj is null....");
		}
		
		
		////
		
		
		try{
			//----
			int p = 9/3;
			obj = null;
			obj.getName();
			System.out.println("hello testing...." + p);
		}
		catch(ArithmeticException e){
			System.out.println("Arith Excep...");
		}
		catch(NullPointerException e){
			System.out.println("NPE");
		}
		
		
		
	}
	
	public void getName(){
		System.out.println("get name");
	}

}
