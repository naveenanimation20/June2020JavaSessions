package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {

	// can not create a function/method inside a function
	// functions are always independent or parallel to each other

	public static void main(String ar[]) {

		System.out.println("main method");

		// create the object of class:
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getName();

		int i = obj.add();
		System.out.println(i + 20);

		String n = obj.getTrainerName();
		System.out.println("trainer name is : " + n);

		System.out.println(obj.isPermanent());

		int s1 = obj.sum(10, 20);
		System.out.println(s1);

		int s2 = obj.sum(40, 50);
		System.out.println(s2);

		double value = obj.multiply(2.3, 3.4);
		System.out.println(value);
		
		System.out.println(obj.getStudentMarks("Naveen"));
		System.out.println(obj.getStudentMarks("Tom"));
		System.out.println(obj.getStudentMarks("naveen"));
		
		obj.launchDriver("opera");

		System.out.println(obj.getStundetNames("first")[0]);
		
		String studentArray[] = obj.getStundetNames("second");
		for (String s : studentArray) {
			System.out.println(s);
		}
		
		//
		ArrayList<String> walMartProdList = obj.getProductList("walmart");
		System.out.println("total products in walmart store: " + walMartProdList.size());
//		for (String prod : walMartProdList) {
//			System.out.println(prod);
//		}
		
		//walMartProdList.forEach(ele -> System.out.println(ele));
		walMartProdList.stream().forEach(System.out::println);//method reference in JDK 1.8
		
		System.out.println(obj.isUSCitizen("Shweta"));

	}

	// 1. no input and no return:
	// void -- method can not return anything
	//return type: void
	public void test() {
		System.out.println("test method...");
	}

	public void getName() {
		System.out.println("get name method...");
	}

	// 2. no input but some return:
	//return type: int
	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	public String getTrainerName() {
		String name = "Naveen";
		return name;
	}

	public boolean isPermanent() {
		boolean flag = true;
		return flag;
	}

	// 3. some input but some return:
	public int sum(int x, int y) {
		System.out.println("SUM method....");
		int s = x + y;
		return s;
	}

	//return type: double
	/**
	 * this is used to multiply two numbers
	 * @param g
	 * @param h
	 * @return mul
	 */
	public double multiply(double g, double h) {
		System.out.println("multiply method");
		double mul = g * h;
		return mul;
	}

	/**
	 * This method is used to get the student marks on the basis of names.
	 * @param name
	 * @return int
	 */
	public int getStudentMarks(String name) {

		System.out.println("get Student Marks for ..." + name);
		
		int marks = -1;
		
		if (name.equalsIgnoreCase("Naveen")) {
			marks = 10;
		}

		else if (name.equalsIgnoreCase("Priya")) {
			marks = 50;
		}

		else if (name.equalsIgnoreCase("Piyanka")) {
			marks = 70;
		}

		else if (name.equalsIgnoreCase("llias")) {
			marks = 90;
		}

		else {
			System.out.println(name + " is not found....");
		}
		
		return marks;

	}
	
	//WAM where u have to send the browser name and launch the browser accordingly.
	
	public void launchDriver(String browserName){
		
		System.out.println("launching browser....");
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.out.println("launch google chrome");
		}
		
		else if(browserName.equalsIgnoreCase("firefox")){
			System.out.println("launch mozilla firefox");
		}
		
		else if(browserName.equalsIgnoreCase("safari")){
			System.out.println("launch apple safari");
		}
		
		else if(browserName.equalsIgnoreCase("ie")){
			System.out.println("launch MS IE");
		}
		
		else{
			System.out.println("browser is not found: " + browserName + " we dont support this browser...");
		}
		
	}
	
	//WAM --> which will take className(String) -- return the list of Student Names (static Array)
	public String[] getStundetNames(String className){
		String stundetNames[] = new String[3];
		
		if(className.equalsIgnoreCase("first")){
			stundetNames[0]="Tom";
			stundetNames[1]="Peter";
			stundetNames[2]="Steve";
		}
		
		else if(className.equalsIgnoreCase("second")){
			stundetNames[0]="naveen";
			stundetNames[1]="Rupali";
			stundetNames[2]="Shiva";
		}
		
		return stundetNames;
	}
	
	//WAM -- which will take ecomm site name, then return list of all the products
	public ArrayList<String> getProductList(String siteName){
		System.out.println("get the list of products from " + siteName);
		
		ArrayList<String> productList = new ArrayList<String>();
		
		if(siteName.equalsIgnoreCase("flipkart")){
			productList.add("Apple Macbook Pro");
			productList.add("Apple iPhoneX");
			productList.add("Nike Shoes");
		}
		
		else if(siteName.equalsIgnoreCase("amazon")){
			productList.add("Apple Macbook air");
			productList.add("Apple iPhoneX");
			productList.add("Reebok Shoes");
		}
		
		else if(siteName.equalsIgnoreCase("walmart")){
			productList.add("Windows 10 Lenovo");
			productList.add("Apple iPhoneX");
			productList.add("Nike Tshirts");
		}
		
		else{
			System.out.println("product list is not available for site: " + siteName);
		}
		
		return productList;
	}
	
	
	//WAM which will decide that person is US citizen or not...
	public boolean isUSCitizen(String personName){
		System.out.println("status for : " + personName);
		
		boolean status = false;
		
		if(personName.equalsIgnoreCase("Nimpa")){
			return status;
		}
		
		else if(personName.equalsIgnoreCase("Shweta")){
			status = true;
			return status;
		}
		
		else if(personName.equalsIgnoreCase("Naveen")){
			return status;
		}
		
		else{
			System.out.println(personName + " is not found.....");
			//return status;
		}
		
		return status;
	}
	
	
	
	
	
	

}
