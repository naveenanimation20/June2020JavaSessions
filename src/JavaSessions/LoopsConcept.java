package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while:  1 to 10
		int i = 1; //intialization
		while(i<=10){//conditional
			System.out.println(i);//1 2 3 4 5.. 10
			//i++;
			i=i+1;//incremental/decremental
		}
		
		System.out.println("--------");
		
		int k = 1;
		while(k<=20){
			System.out.println(k);
			if(k % 2 == 0){
				System.out.println("hiii");
			}
			k++;
		}
		
		//4%2 = 0
		//5%2 = 	1
		//15%3 = 0
		//infinite loop:
//		while(true){
//			System.out.println("welcome to my restaurent!!!");
//		}
		
		boolean flag = true;
		while(flag){
			System.out.println("Hello!!");
			flag = false;
		}
		
		System.out.println("-----for loop----");
		//2. for loop: 1 to 10
		for(int p=1; p<=10; p++){
			System.out.println(p);
		}
		
		System.out.println("-----odd numbers----");

		for(int l=1; l<=10; l=l+2){
			System.out.println(l);//1 3 5 7 9 
		}
		
		System.out.println("-----even numbers----");

		for(int l=0; l<=10; l=l+2){
			System.out.println(l);//2 4 6 8 10
		}
		
		//uses of for loop:
		//list or arrays operations: for loop
		
//		for(; ;){
//			System.out.println("testing...");
//		}
		
		boolean h1 = true;
		for(int m=1; h1 ; m++){
			System.out.println("testing...");
			h1 = false;
		}
		
		System.out.println("-----");
		for(char c ='a'; c<='z'; c++){
			System.out.println(c);
		}
		
		System.out.println("------");
		//do-while:
		int n = 0;
		do{
			System.out.println(n);
			n++;
		}
		while(false);
		
		for(double d=1.2; d<=10; d++){
			System.out.println(d);
		}
		
//		for(String s="test"; s.contains("t"); ){
//			System.out.println(s);
//		}
		
		System.out.println("------");

		// 00 01 02 03
		// 10 11 12 13 
		// 20 21 22 23
		
		for(int p=0; p<=9; p++){
			
			for(int q=0; q<=9; q++){
				
				System.out.print(p+""+q + " ");//00 01 02 03 04 05 06...09 
			}
			
			System.out.println();
			
		}
		
		
	}

}
