package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubteWayTest {
	private SubteWay subteway;
	private ConstructorSandwich constructorSandwich;
	private Sandwich sandwich;

	@BeforeEach
	void setUp() throws Exception {
		this.constructorSandwich = new ConstructorSandwich();
		this.subteway = new SubteWay(this.constructorSandwich);
	}

	@Test
	void testHacerSandwichClasico() {
		this.subteway.hacerSandwichClasico();
		sandwich = this.constructorSandwich.obtenerSandwich();
		assertEquals(500,sandwich.calcularMonto());
	}
	
	@Test
	void testHacerSandwichVegetariano() {
		this.subteway.hacerSandwichVegetariano();
		sandwich = this.constructorSandwich.obtenerSandwich();
		assertEquals(420,sandwich.calcularMonto());
	}
	
	@Test
	void testHacerSandwichVegano() {
		this.subteway.hacerSandwichVegano();
		sandwich = this.constructorSandwich.obtenerSandwich();
		assertEquals(620,sandwich.calcularMonto());
	}
	
	@Test
	void testHacerSandwichSinTACC() {
		this.subteway.hacerSandwichSinTACC();
		sandwich = this.constructorSandwich.obtenerSandwich();
		assertEquals(618,sandwich.calcularMonto());
	}

}
