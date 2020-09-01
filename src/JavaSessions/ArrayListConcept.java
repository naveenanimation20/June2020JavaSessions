package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		int pp = 10;
		System.out.println(pp);
		
		//default class in java
		
		//new keyword -- create the obejct of ArrayList
		
		ArrayList ar = new ArrayList(5);
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());

		ar.add(600);//5
		ar.add(700);//6
		ar.add(800);//7
		ar.add("test");//8
		ar.add(12.33);//9
		ar.add('a');//10
		ar.add(true);//11
		
		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(7));
		//System.out.println(ar.get(-1));//arrayindexOutOfBoundException
		
		//to print all the values from arraylist: 
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		
		//integer data arraylist:
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		
		for(int i : marks){
			System.out.println(i);
		}
		

		//marks.add(12.33);
		
		ArrayList<Double> bmi = new ArrayList<Double>();
		
		System.out.println("-------");
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Simran");
		studentNames.add("Sesha");
		studentNames.add("Ramya");
		studentNames.add("Sri");
		studentNames.add("Rupali");
		
		//for each:
		int count = 0;
		for(String s : studentNames){
			System.out.println(s + " " + count);
				if(s.equals("Sri")){
					System.out.println("she got 100 marks");
				}
				
				else if(s.equals("Simran")){
					System.out.println("poor attendance");
				}
				
				else if(s.equals("Ramya")){
					System.out.println("100% attendance");
				}
				
				count++;
		}

		System.out.println("-------");


		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Vibha");
		empData.add(35);
		empData.add('f');
		empData.add(34.55);
		empData.add(true);
		
		Collections.swap(empData, 0, 1);
		System.out.println(empData);
		
		for(int i=0; i<empData.size(); i++){
			System.out.println(empData.get(i));
		}
		
		for (Object e : empData) {
			System.out.println(e);
		}
		
		empData.forEach(ele->System.out.println(ele));
		empData.stream().forEach(System.out::println);
		
	}

}
