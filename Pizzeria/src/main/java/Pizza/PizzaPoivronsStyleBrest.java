package Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaPoivronsStyleBrest extends Pizza {
	
	public PizzaPoivronsStyleBrest() {
		super.pate = "pâte style Brest";
		
		super.nom = "Pizza "+pate+" et semoule de maïs";
		super.garnitures.add(" Poivrons rouge");
		super.garnitures.add(" Poivrons vert");
	}


}
