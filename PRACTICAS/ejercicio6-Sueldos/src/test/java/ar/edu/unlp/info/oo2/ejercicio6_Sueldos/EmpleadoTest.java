package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	
	private Empleado temporario;
	private Empleado pasante; 
	private Empleado planta;
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(2,true,8);
		pasante = new Pasante(0, true, 2); 
		planta = new Planta(2,true,8);
	}
	
	@Test
	void testDescuento() {
		assertEquals(2912+4500,this.temporario.descuento());
		assertEquals(2600+2000,this.pasante.descuento());
		assertEquals(6500+12500,this.planta.descuento());
	}
	
	@Test
	void testSueldo() {
		assertEquals(22400+9000-(2912+4500),this.temporario.sueldo());
		assertEquals(20000+4000-(2600+2000),this.pasante.sueldo());
		assertEquals(50000+25000-(6500+12500),this.planta.sueldo());
	}
	

}
