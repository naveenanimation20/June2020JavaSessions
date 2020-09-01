package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDetails {
	
	
	public static void main(String ar[]){
		
		
		//<k,v>
		HashMap<String, String> EmpMap = new HashMap<String, String>();
		EmpMap.put("name", "Tom");
		EmpMap.put("email", "tom@gmail.com");
		EmpMap.put("city", "Bangalore");
//		EmpMap.put(null, "India");
//		EmpMap.put(null, "USA");
		EmpMap.put("country", null);
		EmpMap.put("lastname", null);

		
		System.out.println(EmpMap.get("name"));
		System.out.println(EmpMap.get("city"));
		System.out.println(EmpMap.get("country"));
		System.out.println(EmpMap.get("lastname"));

		
		//entrySet(), getKey() and getValue()
		for(Map.Entry<String, String> e : EmpMap.entrySet()){
			System.out.println("key = " + e.getKey() + " value = " + e.getValue());
		}
		
		//keySet()
		for(String s : EmpMap.keySet()){
			System.out.println("key = "+ s);
		}
		
		//values()
		for(String v : EmpMap.values()){
			System.out.println("value: " + v);
		}

		//forEach with Lambda expression:
		EmpMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		
		HashMap<String, Integer> studentMarks = new HashMap<String, Integer>();
		studentMarks.put("puneeth", 90);
		studentMarks.put("ravu", 80);

		
	}
	
	
	

}
