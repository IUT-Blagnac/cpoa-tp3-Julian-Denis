package Pizzeria;

import static org.junit.Assert.*;

import org.junit.Test;

import Fabrique.PizzeriaFactory;

public class TestJunit {
	PizzeriaFactory f1;
	PizzeriaFactory f2;
	@Test
	public void testDeuxFabriquesEgales() {
		f1 = PizzeriaFactory.getInstance();
		f2 = PizzeriaFactory.getInstance();
		
		assertEquals(f1, f2);
	}
}
