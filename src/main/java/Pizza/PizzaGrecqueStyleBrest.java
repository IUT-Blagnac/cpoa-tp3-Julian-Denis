package Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaGrecqueStyleBrest extends Pizza{
	
	public PizzaGrecqueStyleBrest() {
		super.sauce = "sauce style Brest";
		
		super.nom = "Pizza "+sauce+" et poivrons";
		super.garnitures.add(" Mozarela");
		super.garnitures.add(" Feta");
	}


}
