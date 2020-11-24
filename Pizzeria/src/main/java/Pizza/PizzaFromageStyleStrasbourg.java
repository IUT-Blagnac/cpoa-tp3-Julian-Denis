package Pizza;


public class PizzaFromageStyleStrasbourg extends Pizza{

	public PizzaFromageStyleStrasbourg() {
		super.sauce = "pâte style Strasbourg";
		
		super.nom = "Pizza "+sauce+" et fromage";
		super.garnitures.add(" Mozzarella en lamelles");
	}

	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}
	
	

}
