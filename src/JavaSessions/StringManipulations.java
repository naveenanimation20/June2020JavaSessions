package JavaSessions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulations {

	public static void main(String[] args) {

		String str = "This is my java code and i am so happy";
		
//		System.out.println(str.length());
//		
//		int l = str.length();//38
//		System.out.println("the length of String is : "+ l);
//		System.out.println("LI -->" + 0);//0
//		System.out.println("HI -->" + (l-1));//37
//		
//		System.out.println(str.charAt(3));
//		
//		System.out.println(str.charAt(0));
//		
//		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException: String index out of range: 38
//		System.out.println(str.charAt(l-1));
//		System.out.println(str.charAt(l-4));
//		
//		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
//		
//		
//		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('s'));//1st occurrence of s --> 3
		System.out.println(str.indexOf("s", str.indexOf('s')+1  ));//2nd occurrence of s
		System.out.println(str.indexOf("s", (str.indexOf("s", str.indexOf('s')+1)+1)));
		
		System.out.println(str.indexOf("java"));//11
		System.out.println(str.indexOf("Vibha"));//-1
		
		String s1 = "This is MY first java code";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//trim:
		String s2 = "     hello world      ";
		System.out.println(s2.trim());
		
		//replace:
		String s3 = "hello naveen"; //hellonaveen
		System.out.println(s3.replace(" ", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		String s4 = "I love Java";
		System.out.println(s4.replace("Java", "Python"));
		
		//contains:
		String userName = "Welcome null";
		System.out.println(userName.contains("admin"));//true
		
		if(userName.contains("admin")){
			System.out.println("admin is present");
		}else{
			System.out.println("admin is not present");

		}
		
		//equals:
		String st1 = "this is naveen here";
		String st2 = "this is Naveen here";

		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		//sub string:
		String st3 = "your transaction id is 45555";
		System.out.println(st3.substring(4, 10));
		System.out.println(st3.substring(5, 10));
		
		System.out.println(st3.substring(5));
		
		System.out.println(st3.substring(st3.indexOf("is")+3));
		
		String trId = st3.substring(st3.indexOf("is")+3, st3.length());//45555
		
		int transId = Integer.parseInt(trId);
		
		System.out.println(transId+100);
		
		String lang = "java-python-net-ruby";
		System.out.println(lang.split("-")[3]);
		
		String s = "your transaction id is: 12345 and reference id is: 34567";
		System.out.println(s.replaceAll("[^0-9]", ""));

		double ff = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(ff);
		
		Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while(m.find()) {
            System.out.println(m.group());
        }
		
	}

}
