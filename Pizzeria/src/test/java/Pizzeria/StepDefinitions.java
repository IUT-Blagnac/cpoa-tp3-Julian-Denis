package Pizzeria;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.ArrayList;

import Fabrique.PizzeriaFactory;
import Pizza.Pizza;
import Pizza.PizzaGrecqueStyleBrest;
import Pizza.PizzaGrecqueStyleStrasbourg;
import Pizza.PizzaPoivronsStyleBrest;
import Pizza.PizzaPoivronsStyleStrasbourg;

public class StepDefinitions {

	PizzeriaFactory f1;
	PizzeriaFactory f2;
	
	Pizza p;
	String sauce;
	ArrayList<String> garnitures;
	
	@Given("une fabrique A")
	public void creerFabriqueA() {
		f1 = PizzeriaFactory.getInstance();
	}
	@Given("une pizza grecque de style brest")
	public void creerPizzGrecBrest() {
		p = new PizzaGrecqueStyleBrest();
	}
	@Given("une pizza grecque de style strasbourg")
	public void creerPizzGrecStras() {
		p = new PizzaGrecqueStyleStrasbourg();
	}
	@Given("une pizza poivrons de style brest")
	public void creerPizzPoivBrest() {
		p = new PizzaPoivronsStyleBrest();
	}
	@Given("une pizza poivrons de style strasbourg")
	public void creerPizzPoivStras() {
		p = new PizzaPoivronsStyleStrasbourg();
	}
	
	@When("une fabrique B est créée")
	public void creerFabriqueB() {
		f2 = PizzeriaFactory.getInstance();
	}
	@When("on veut sa sauce")
	public void sauce() {
		sauce = p.getSauce();
	}
	@When("on veut ses garnitures")
	public void garnitures() {
		garnitures = new ArrayList<>();
		for (String string : p.getGarnitures()) {
			garnitures.add(string);
		}
	}
	
	@Then("fabrique A et B sont égaux")
	public void test_A_egal_B() {
		assertEquals(f1, f2);
	}	
	@Then("on obtient {string}")
	public void sauceResultat(String sauce) {
		assertEquals(sauce, this.sauce);
	}	
	@Then("on obtient {int} poivrons")
	public void nbPoivrons(int nb) {
		assertEquals(nb, garnitures.size());
	}

}
