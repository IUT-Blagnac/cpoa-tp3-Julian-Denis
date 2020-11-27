package Fabrique;

import Pizza.Pizza;

public class PizzeriaFactory {
	private final static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	private PizzeriaFactory() {
		
	}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
	
	public Pizzeria creer(String nom) {
		switch(nom) {
		case "Brest":
			PizzeriaStyleBrest pizzeriaB = new PizzeriaStyleBrest();
			return pizzeriaB;
		
		case "Strasbourg":
			PizzeriaStyleStrasbourg pizzeriaS = new PizzeriaStyleStrasbourg();
			return pizzeriaS;
		
		default : 
			return null;
		}
		
	}
}
