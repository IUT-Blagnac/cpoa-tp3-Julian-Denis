package Pizza;

import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	
	protected String pate;
	protected String sauce;
	protected String nom;
	protected ArrayList<String> garnitures = new ArrayList<>();
	
	public void preparer() {
		System.out.println("Pr�paration de "+nom);
		System.out.println("Etalage de la p�te...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures:");
		for (String string : garnitures) {
			System.out.println(string);
		}
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes � 180�");
	}

	public void couper() {
		System.out.println("Decoupage en parts triangulaires");
	}

	public void emballer() {
		System.out.println("Emballage dans une bo�te officielle");
	}

	public String getNom() {
		return nom;
	}

}
