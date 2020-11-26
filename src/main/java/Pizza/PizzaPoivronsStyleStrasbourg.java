package Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaPoivronsStyleStrasbourg extends Pizza {
	
	public PizzaPoivronsStyleStrasbourg() {
		super.pate = "pâte style Strasbourg";
		
		super.nom = "Pizza "+pate+ " et semoule de maïs";
		super.garnitures.add(" Poivrons rouge");
		super.garnitures.add(" Poivrons vert");
		super.garnitures.add(" Poivrons de strasbourg");
	}

	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}


}
