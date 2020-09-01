package JavaSessions;

public class Company {

	public String name;
	public int empCount;
	public String hq;
	public String logo;
	private String policy;
	
	private void getSalary(){
		System.out.println("get emp salary");
	}
	
	public void getEmpData(){
		getSalary();
	}
	
	public Company(String name, int empCount, String hq, String logo, String policy) {
		this.name = name;
		this.empCount = empCount;
		this.hq = hq;
		this.logo = logo;
		this.policy = policy;
	}
	
	public String getPolicy(){
		return policy;
	}
	
	
	public static void main(String ar[]){
		
		Company c1 = new Company("IBM", 10000, "NY", "IBM", "Project Estimation");
		System.out.println(c1.name);
		System.out.println(c1.policy);
		
		System.out.println(c1.getPolicy());
		
		c1.getSalary();
	}
	
	
	
	
	
	
	
	

}
