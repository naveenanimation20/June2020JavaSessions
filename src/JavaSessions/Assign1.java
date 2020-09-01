package JavaSessions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assign1 {

	public static void main(String[] args) {

		String s = "welcome to naveen automation labs";
		
		System.out.println(s.indexOf('e'));//1
		
		System.out.println(s.indexOf("e", s.indexOf('e')+1));//6
		
		System.out.println(s.indexOf("e", s.indexOf("e", s.indexOf('e')+1)+1));//14
		
		String s1 = "transaction id is : 12345";
		System.out.println(s1.replaceAll("[^0-9]", ""));
		
		String s2 = "transaction id is : 12345 and ref id is: 3456 and ur amount is : 3444";

		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s2);
		
		while(m.find()){
			System.out.println(m.group());
		}
		
	}

}
