package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlantaTest {
	private Planta plantaSinNada8anios;
	private Planta plantaCasadoConHijos8anios;
	private Planta plantaCasadoConHijos;
	private Planta plantaCasadoSinHijos;

	@BeforeEach
	void setUp() throws Exception {
		plantaSinNada8anios = new Planta(0, false,8);
		plantaCasadoConHijos8anios = new Planta(2,true,8);
		plantaCasadoConHijos = new Planta(2,true,0);
		plantaCasadoSinHijos = new Planta(0,true,0);
	}

	@Test
	void testSueldoBasico() {
		assertEquals(50000,this.plantaSinNada8anios.sueldoBasico());
	}
	
	@Test
	void testSueldoAdicional() {
		assertEquals(5000,this.plantaCasadoSinHijos.sueldoAdicional());
		assertEquals(9000,this.plantaCasadoConHijos.sueldoAdicional());
		assertEquals(16000,this.plantaSinNada8anios.sueldoAdicional());
		assertEquals(25000,this.plantaCasadoConHijos8anios.sueldoAdicional());
		
	}
}
