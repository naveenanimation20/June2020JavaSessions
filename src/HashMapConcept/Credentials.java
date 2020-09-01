package HashMapConcept;

import java.util.HashMap;

public class Credentials {
	static HashMap<String, String> credMap;
	
	public static void main(String ar[]){

		
		//customer
		//seller
		//distributor
		//vendor
		//partners
		//categorymanager		
		credMap = new HashMap<String, String>();
		
		credMap.put("customer", "naveen@gmail.com:Test@123");
		credMap.put("seller", "rupali@gmail.com:Test@12345");
		credMap.put("distributor", "ramya@gmail.com:Test@123456");
		credMap.put("vendor", "nimpa@gmail.com:Test@123457");
		credMap.put("partner", "ravi@gmail.com:Test@1234555");
		//credMap.put("partner", "tom@gmail.com:Test@1234555");
		credMap.put("categorymanager", "simran@gmail.com:Test@1234445");

		
		Credentials obj = new Credentials();
		//obj.doLogin(credMap.get("customer").split(":")[0].trim(), credMap.get("customer").split(":")[1].trim());
		obj.doLogin("customer");
		obj.doLogin("seller");
		
		obj.doLogin(credMap.get("partner").split(":")[0].trim(), credMap.get("partner").split(":")[1].trim());
	}
	
	
	public void doLogin(String role){
		String username = credMap.get(role).split(":")[0].trim();
		String password = credMap.get(role).split(":")[1].trim();
		System.out.println("login with : " + username + " and " + password);
	}
	
	public void doLogin(String username, String password){
		System.out.println("login with : " + username + " and " + password);
	}
	

}
