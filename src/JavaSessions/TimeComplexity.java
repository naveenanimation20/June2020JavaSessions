package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC --> O(n) -- > Big O(n)
		
		int i = 1;
		System.out.println(i);
		// O(1)
		
		String s = "selenium";
		System.out.println(s+" testing");
		//O(1)
		
		for(int k = 1; k<=10; k++){
			System.out.println(k);
		}
		//O(n)
		//1 + n + n + n ==> 1+3n ==> 3n ==> O(n) -- 
		//linear equation
		
		
		for(int m = 1; m<=10; m++){
			for(int n = 1; n<=10; n++){
				System.out.print(m+""+n);
			}
			System.out.println();
		}
		
		//(1 + n + n) x (1+ n + n + n) + n ==> (1+3n) x (1+3n) ==> 1+ 3n + 3n + 9n^2 ==> 1+6n+9n^2 
		//9n^2 + 6n + 1 ==> Quadratic Equation
		//9n^2 + 6n ==> n^2 + n --> O(n^2)
		
		
	}

}
