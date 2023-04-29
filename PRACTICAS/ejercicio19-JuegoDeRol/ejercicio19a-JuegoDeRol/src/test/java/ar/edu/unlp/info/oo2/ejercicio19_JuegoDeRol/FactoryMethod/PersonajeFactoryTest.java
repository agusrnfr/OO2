package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.FactoryMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje.Mago;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje.Personaje;

class PersonajeFactoryTest {
	private PersonajeFactory creadorArquero;
	private PersonajeFactory creadorGuerrero;
	private PersonajeFactory creadorMago;
	private Personaje mago;
	private Personaje arquero;
	private Personaje guerrero;

	@BeforeEach
	void setUp() throws Exception {
		creadorArquero = new CreadorArquero();
		arquero = creadorArquero.crearPersonaje();
		creadorGuerrero = new CreadorGuerrero();
		guerrero = creadorGuerrero.crearPersonaje();
		creadorMago = new CreadorMago();
		mago = creadorMago.crearPersonaje();
	}

	@Test
	void testCrearPersonaje() {
		assertEquals("Soy el Mago Syndra y me queda 100 de vida.",mago.toString());
		assertEquals("Soy el Guerrero Riven y me queda 100 de vida.",guerrero.toString());
		assertEquals("Soy el Arquero Ashe y me queda 100 de vida.",arquero.toString());
	}
	
	@Test
	void testAtacarGuerrero() {
		guerrero.atacar(mago); //8 de vida tiene armadura de cuero
		assertEquals("Soy el Mago Syndra y me queda 92 de vida.",mago.toString());
		guerrero.atacar(guerrero); //3 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 97 de vida.",guerrero.toString());
	}
	
	@Test
	void testAtacarArquero() {
		arquero.atacar(guerrero); //2 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 98 de vida.",guerrero.toString());
		arquero.atacar(mago); //5 de vida tiene armadura de cuero
		assertEquals("Soy el Mago Syndra y me queda 95 de vida.",mago.toString());
	}
	
	@Test
	void testAtacarMago() {
		mago.atacar(arquero); //2 de vida tiene armadura de cuero
		assertEquals("Soy el Arquero Ashe y me queda 98 de vida.",arquero.toString());
		mago.atacar(guerrero); //1 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 99 de vida.",guerrero.toString());
	}
	


}
