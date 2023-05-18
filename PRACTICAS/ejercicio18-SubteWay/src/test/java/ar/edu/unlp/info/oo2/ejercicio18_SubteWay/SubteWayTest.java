package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubteWayTest {
	private SubteWay subteway;
	private Constructor constructorSandwichClasico;
	private Constructor constructorSandwichVegetariano;
	private Constructor constructorSandwichVegano;
	private Constructor constructorSandwichSinTACC;
	private Sandwich sandwich;

	@BeforeEach
	void setUp() throws Exception {
		this.constructorSandwichClasico = new ConstructorSandwichClasico();
		this.constructorSandwichVegetariano = new ConstructorSandwichVegetariano();
		this.constructorSandwichVegano = new ConstructorSandwichVegano();
		this.constructorSandwichSinTACC = new ConstructorSandwichSinTACC();
	}

	@Test
	void testHacerSandwichClasico() {
		this.subteway = new SubteWay(this.constructorSandwichClasico);
		this.subteway.hacerSandwich();
		sandwich = this.constructorSandwichClasico.obtenerSandwich();
		assertEquals(500,sandwich.calcularMonto());
	}
	
	@Test
	void testHacerSandwichVegetariano() {
		this.subteway = new SubteWay(this.constructorSandwichVegetariano);
		this.subteway.hacerSandwich();
		sandwich = this.constructorSandwichVegetariano.obtenerSandwich();
		assertEquals(420,sandwich.calcularMonto());
	}
	
	@Test
	void testHacerSandwichVegano() {
		this.subteway = new SubteWay(this.constructorSandwichVegano);
		this.subteway.hacerSandwich();
		sandwich = this.constructorSandwichVegano.obtenerSandwich();
		assertEquals(620,sandwich.calcularMonto());
	}
	
	@Test
	void testHacerSandwichSinTACC() {
		this.subteway = new SubteWay(this.constructorSandwichSinTACC);
		this.subteway.hacerSandwich();
		sandwich = this.constructorSandwichSinTACC.obtenerSandwich();
		assertEquals(618,sandwich.calcularMonto());
	}

}
