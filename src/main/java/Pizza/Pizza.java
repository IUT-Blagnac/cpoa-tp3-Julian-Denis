package Pizza;



import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	
	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garniture = new ArrayList<String>();
	
	public void preparer() {
		
		System.out.println("Préparation de "+nom);
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures:\n"+garniture.get(0).toString());
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
		
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires");
		
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
		
	}
	
	public String getNom() {
		return nom;
	}
	
	

}
