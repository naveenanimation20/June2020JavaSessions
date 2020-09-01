package OOP_AbstractConcept;

public class HomePage extends Page{

	@Override
	public void header() {
		System.out.println("HP -- header");
	}

	@Override
	public void title() {
		System.out.println("HP -- title");
		
	}
	
	public void showAccountDetails(){
		System.out.println("HP -- showAccountDetails");
	}
	
	@Override
	public void display(){
		System.out.println("Home Page -- display with some welcome banner");
	}

}
