package Fabrique;

public class PizzeriaFactory {

	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	private PizzeriaFactory() {
		
	}
	
	public static PizzeriaFactory getInstance() {
		// TODO Auto-generated method stub
		return uniqueInstance;
	}

	public Pizzeria creer(String string) {

		switch(string) {
		case "Brest":
			return new PizzeriaBrest();
			
		case "Strasbourg":
			return new PizzeriaStrasbourg();
		}
		return null;
	}
	
	

}
