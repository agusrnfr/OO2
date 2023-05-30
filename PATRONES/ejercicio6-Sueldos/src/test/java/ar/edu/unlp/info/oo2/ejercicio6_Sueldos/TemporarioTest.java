package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {
	private Temporario temporarioSinNada8Horas;
	private Temporario temporarioSinNada10Horas;
	private Temporario temporarioCasadoConHijos;
	private Temporario temporarioCasadoSinHijos;

	@BeforeEach
	void setUp() throws Exception {
		temporarioSinNada8Horas = new Temporario(0,false,8);
		temporarioSinNada10Horas = new Temporario(0,false,10);
		temporarioCasadoConHijos =  new Temporario(2,true,8);
		temporarioCasadoSinHijos = new Temporario(0,true,8);
	}

	@Test
	void testSueldoBasico() {
		assertEquals(22400,this.temporarioSinNada8Horas.sueldoBasico());
		assertEquals(23000,this.temporarioSinNada10Horas.sueldoBasico());
	}
	
	@Test
	void testSueldoAdicional() {
		assertEquals(0,this.temporarioSinNada8Horas.sueldoAdicional());
		assertEquals(5000,this.temporarioCasadoSinHijos.sueldoAdicional());
		assertEquals(9000,this.temporarioCasadoConHijos.sueldoAdicional());
	}

}
