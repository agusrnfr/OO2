package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

import static org.junit.jupiter.api.Assertions.*;
/*
Escriba un test para inscribir a un usuario en la excursión “Dos días en kayak bajando el Paraná”, 
con cupo mínimo de 1 persona y cupo máximo 2, con dos personas ya inscriptas. 
Implemente todos los mensajes que considere necesarios.
 */

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	@BeforeEach
	public void setUp() throws Exception {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 4, 6), LocalDate.of(2023, 4, 8), 
									   "Terminal de Ómnibus de La Plata", 5000,1,2);
		this.usuario1 = new Usuario("Lana", "Del Rey", "lanadelrey1985@gmail.com");
		this.usuario2 = new Usuario("Taylor", "Swift", "taylorswift13@gmail.com");
		this.usuario3 = new Usuario("Lily", "Rabe", "lilyrabe82@gmail.com");
		System.out.println(this.excursion.obtenerInformacion()); //queria ver como imprimia je
		this.excursion.inscribir(usuario1);
		System.out.println(this.excursion.obtenerInformacion());
		this.excursion.inscribir(usuario2);
		System.out.println(this.excursion.obtenerInformacion());
	}

	@Test
	public void testInscribir() {
		this.excursion.inscribir(usuario3);
		assertEquals(1,this.excursion.getEnEspera().size());
		assertEquals(2,this.excursion.getInscriptos().size());
		assertTrue(this.excursion.getInscriptos().contains(usuario1));
		assertTrue(this.excursion.getInscriptos().contains(usuario2));
		assertFalse(this.excursion.getInscriptos().contains(usuario3));
		assertTrue(this.excursion.getEnEspera().contains(usuario3));
		assertTrue(this.excursion.getEstado() instanceof Completa);
	}

}
