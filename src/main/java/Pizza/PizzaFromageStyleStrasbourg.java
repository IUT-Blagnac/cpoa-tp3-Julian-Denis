package Pizza;


public class PizzaFromageStyleStrasbourg extends Pizza {
	
	public PizzaFromageStyleStrasbourg() {
		super.nom = "Pizza pate style Strasbourg et fromage";
		super.garniture.add(" Mozzarella en lamelles");
	}

	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
		
	}
	
	
}
