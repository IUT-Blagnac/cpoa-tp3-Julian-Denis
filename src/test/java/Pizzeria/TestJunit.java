package Pizzeria;

import static org.junit.Assert.*;


import org.junit.Test;
import Fabrique.Pizzeria;
import Fabrique.PizzeriaFactory;
import Pizza.Pizza;
import Pizza.PizzaFromageStyleStrasbourg;

public class TestJunit {
	
	@Test
    public void testNomPizzaStrasbourg() {
        Pizza pizzaFromageStyleStrasbourg = new PizzaFromageStyleStrasbourg();
        assertEquals(pizzaFromageStyleStrasbourg.getNom(), "Pizza pate style Strasbourg et fromage");
    }
    
    @Test
    public void testQuelEstMonStyleDePizzeria() {
    	Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
    	String style = "PizzeriaStyleBrest";
    	String StylePizzeriaATester = boutiqueBrest.getClass().getSimpleName();
    	assertEquals(style,StylePizzeriaATester);
    }
    
    @Test
    public void testJeSuisQuoi() {
    	Pizza pizzaFromageStyleStrasbourg = new PizzaFromageStyleStrasbourg();
    	String s = pizzaFromageStyleStrasbourg.toString();
    	s = s.substring(0,5);
    	//Normalement je suis une pizza...
    	assertEquals("Pizza",s);
    }
    
    
}
