package Pizza;


public class PizzaFromageStyleStrasbourg extends Pizza{

	public PizzaFromageStyleStrasbourg() {
		super.sauce = "p�te style Strasbourg";
		
		super.nom = "Pizza "+sauce+" et fromage";
		super.garnitures.add(" Mozzarella en lamelles");
	}

	@Override
	public void couper() {
		System.out.println("D�coupage en parts carr�es");
	}
	
	

}
