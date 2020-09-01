package JavaSessions;

public class SplitConcpet {

	public static void main(String[] args) {

		
		String str = "java|python|ruby|javascript";
		
		String lang[] = str.split("\\|");
		
		System.out.println(lang.length);
		
		for(String s : lang){
			System.out.println(s);
		}
		
		String con1 = "tom@gmail.com;tom;peter;SDET;9999";
		String contact[] = con1.split(";");
		
		System.out.println(contact[0]);
		
//		for(String s : contact){
//			System.out.println(s);
//		}
		
		String firstName = getEmpData().split(";")[0];
		System.out.println(firstName);
			
	}
	
	public static String getEmpData(){
		
		String fn = "tom";
		String ln = "peter";
		String ph = "999";
		
		String data = fn+";"+ln+";"+ph;
		return data;
		
	}
	
	
	

}
