package Fabrique;

import Pizza.Pizza;
import Pizza.PizzaFromageStyleStrasbourg;
import Pizza.PizzaGrecqueStyleStrasbourg;
import Pizza.PizzaPoivronsStyleStrasbourg;

public class PizzeriaStyleStrasbourg extends Pizzeria{

	public Pizza creerPizza(String type) {
		Pizza pizza = null;

		switch(type) {
		case "fromage":
			pizza = new PizzaFromageStyleStrasbourg();
			return pizza;
		case "grecque":
			pizza = new PizzaGrecqueStyleStrasbourg();
			return pizza;
		case "poivron":
			pizza = new PizzaPoivronsStyleStrasbourg();
			return pizza;
		default:
			return pizza;
		}	
	}

}
