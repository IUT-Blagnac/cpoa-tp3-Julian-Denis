package Pizzeria;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import Fabrique.PizzeriaFactory;

public class StepDefinitions {

	/**
	 *   Scenario: Ne pas avoir 2 fabriques distinctes
  Given une fabrique A
  When une fabrique B est créée
  Then fabrique A et B sont égaux
	 */
	PizzeriaFactory f1;
	PizzeriaFactory f2;
	@When("une fabrique A")
	public void creerFabriqueA() {
		f1 = PizzeriaFactory.getInstance();
	}
	
	@When("une fabrique B est créée")
	public void creerFabriqueB() {
		f2 = PizzeriaFactory.getInstance();
	}
	
	@Then("fabrique A et B sont égaux")
	public void test_A_egal_B() {
		assertEquals(f1, f2);
	}
	
	
	
}
