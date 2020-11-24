package Fabrique;

import Pizza.Pizza;
import Pizza.PizzaFromageStyleStrasbourg;
import Pizza.PizzaGrecqueStyleStrasbourg;
import Pizza.PizzaPoivronsStyleStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleStrasbourg();
		} else {
			pizza = new PizzaPoivronsStyleStrasbourg();
		}
		
		
		return pizza;
	}

}
