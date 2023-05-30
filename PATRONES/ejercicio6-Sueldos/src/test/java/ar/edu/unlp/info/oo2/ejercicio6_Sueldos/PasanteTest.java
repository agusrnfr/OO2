package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasanteTest {
	private Pasante pasanteSinExamen;
	private Pasante pasanteConExamen;

	@BeforeEach
	void setUp() throws Exception {
		pasanteSinExamen = new Pasante(0, true, 0);
		pasanteConExamen = new Pasante(0, true, 2);
	}

	@Test
	void testSueldoBasico() {
		assertEquals(20000,this.pasanteConExamen.sueldoBasico());
	}
	
	@Test
	void testSueldoAdicional() {
		assertEquals(0,this.pasanteSinExamen.sueldoAdicional());
		assertEquals(4000,this.pasanteConExamen.sueldoAdicional());
	}

}
