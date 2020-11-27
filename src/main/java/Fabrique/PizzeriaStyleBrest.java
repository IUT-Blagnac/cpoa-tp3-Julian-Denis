package Fabrique;

import Pizza.Pizza;
import Pizza.PizzaFromageStyleBrest;
import Pizza.PizzaGrecqueStyleBrest;
import Pizza.PizzaPoivronsStyleBrest;

public class PizzeriaStyleBrest extends Pizzeria {

	@Override
	public Pizza creerPizza(String type) {
		Pizza pizza = null;

		switch(type) {
		case "fromage":
			pizza = new PizzaFromageStyleBrest();
			return pizza;
		case "grecque":
			pizza = new PizzaGrecqueStyleBrest();
			return pizza;
		case "poivron":
			pizza = new PizzaPoivronsStyleBrest();
			return pizza;
		default:
			return pizza;
		}	
	}

}
