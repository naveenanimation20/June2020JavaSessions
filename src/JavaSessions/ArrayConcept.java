package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//Arrays:
		//1. static arrays: size is fixed
		//2. similar type of data: 
		//to overcome these issues, we use ArrayList - dynamic array
		//int  array:
		
		int q[] = {10,20,30,40,50};
		System.out.println(q.length);
		System.out.println(q[4]);
		
		int i[] = new int[5];
		
		//i[-1]=50;
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println("Li=" + 0);
		System.out.println(i.length);//5
		System.out.println("Hi = " + (i.length-1));
		
		System.out.println(i[0]);
		System.out.println(i[4]);
		//System.out.println(i[5]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		//to print all the values from array: for loop:
		
		for(int k=0; k<=i.length-1; k++){
			System.out.println(i[k]);//10 20 
		}
		
		//double array:
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=23.44;
		System.out.println(d[0]+d[1]+d[2]);
		System.out.println(d[2]);
		
		//char array:
		char c[] = new char[2];
		c[0]='a';
		c[1]='b';
		System.out.println(c[0]+c[1]);
		
		//String array:
		String empNames[] = new String[3];
		empNames[0] = "Tom";
		empNames[1] = "Naveen";
		empNames[2] = "Peter";
		
		for(int p=0; p<empNames.length; p++){
			System.out.println(empNames[p]);
		}
		
		for (String s : empNames) {
			System.out.println(s);
		}
		
		
		//have to store diff types of infor of an employee: name, age, salary, gender, isPermannet
		//Object Array:
		Object empData[] = new Object[5];
		empData[0] = "Vibha";
		empData[1] = 25;
		empData[2] = 34.55;
		empData[3] = 'f';
		empData[4] = true;
//		empData[5] = 99999;
//		empData[6] = "LA";

		for(int s=0; s<empData.length; s++){
			System.out.println(empData[s]);
		}
		
		Object empData1[] = new Object[5];
		empData1[0] = "Naveen";
		empData1[1] = 25;
		empData1[2] = 34.55;
		empData1[3] = 'm';
		empData1[4] = false;

		int m=0;
		while(m<5){
			System.out.println(empData1[m]);
			m++;
		}
		
		
	}

}
