package Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaGrecqueStyleStrasbourg extends Pizza {
	
	public PizzaGrecqueStyleStrasbourg() {
		super.sauce = "sauce style Strasbourg";
		
		super.nom = "Pizza "+sauce+" et fromage";
		super.garnitures.add(" Mozzarella en cube");
		super.garnitures.add(" Feta en cube");
	}

	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}

}
