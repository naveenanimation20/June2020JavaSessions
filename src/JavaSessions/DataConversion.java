package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//string to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String y = "100test";
//		System.out.println(y+20);
//		
//		int k = Integer.parseInt(y); //NumberFormatException: For input string: "100A"
//		System.out.println(k+20);
		
		//String to double:
		String t = "12.33";
		System.out.println(t+20);
		
		double d = Double.parseDouble(t);//12.33
		System.out.println(d+2000);
		
		//int to String:
		int h = 100;
		System.out.println(h+20);
		
		String h1 = String.valueOf(h);//"100"
		System.out.println(h1+20);		
		
	}

}
