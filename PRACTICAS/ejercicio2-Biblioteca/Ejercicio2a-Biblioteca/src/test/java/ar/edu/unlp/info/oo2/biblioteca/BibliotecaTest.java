package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() throws Exception{
	
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@Test
	public void testExportarSocios() {
		assertTrue(this.biblioteca.exportarSocios().contains("Arya Stark"));
		assertTrue(this.biblioteca.exportarSocios().contains("eedle@stark.com"));
		assertTrue(this.biblioteca.exportarSocios().contains("5234-5"));
		assertTrue(this.biblioteca.exportarSocios().contains("Tyron Lannister"));
		assertTrue(this.biblioteca.exportarSocios().contains("tyron@thelannisters.com"));
		assertTrue(this.biblioteca.exportarSocios().contains("2345-2"));
		
	}
}
