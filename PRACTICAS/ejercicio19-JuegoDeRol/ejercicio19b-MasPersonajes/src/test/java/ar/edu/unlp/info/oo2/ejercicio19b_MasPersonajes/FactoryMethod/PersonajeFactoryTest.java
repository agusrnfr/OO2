package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.FactoryMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Personaje;

class PersonajeFactoryTest {
	private PersonajeFactory creadorArquero;
	private PersonajeFactory creadorGuerrero;
	private PersonajeFactory creadorMago;
	private PersonajeFactory creadorThoor;
	private Personaje mago;
	private Personaje arquero;
	private Personaje guerrero;
	private Personaje thoor;

	@BeforeEach
	void setUp() throws Exception {
		creadorArquero = new CreadorArquero();
		arquero = creadorArquero.crearPersonaje();
		creadorGuerrero = new CreadorGuerrero();
		guerrero = creadorGuerrero.crearPersonaje();
		creadorMago = new CreadorMago();
		mago = creadorMago.crearPersonaje();
		creadorThoor = new CreadorThoor();
		thoor = creadorThoor.crearPersonaje();
	}

	@Test
	void testCrearPersonaje() {
		assertEquals("Soy el Mago Syndra y me queda 100 de vida.",mago.toString());
		assertEquals("Soy el Guerrero Riven y me queda 100 de vida.",guerrero.toString());
		assertEquals("Soy el Arquero Ashe y me queda 100 de vida.",arquero.toString());
		assertEquals("Soy el Thoor Thor y me queda 100 de vida.",thoor.toString());
	}
	
	@Test
	void testAtacarGuerrero() {
		guerrero.atacar(mago); //8 de vida tiene armadura de cuero
		assertEquals("Soy el Mago Syndra y me queda 92 de vida.",mago.toString());
		guerrero.atacar(thoor); // 5 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thor y me queda 95 de vida.",thoor.toString());
		guerrero.atacar(guerrero); //3 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 97 de vida.",guerrero.toString());
	}
	
	@Test
	void testAtacarArquero() {
		arquero.atacar(mago); //5 de vida tiene armadura de cuero
		assertEquals("Soy el Mago Syndra y me queda 95 de vida.",mago.toString());
		arquero.atacar(thoor); // 3 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thor y me queda 97 de vida.",thoor.toString());
		arquero.atacar(guerrero); //2 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 98 de vida.",guerrero.toString());
	}
	
	@Test
	void testAtacarMago() {
		mago.atacar(arquero); //2 de vida tiene armadura de cuero
		assertEquals("Soy el Arquero Ashe y me queda 98 de vida.",arquero.toString());
		mago.atacar(thoor); // 1 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thor y me queda 99 de vida.",thoor.toString());
		mago.atacar(guerrero); //1 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 99 de vida.",guerrero.toString());
	}
	
	@Test
	void testAtacarThoor() {
		thoor.atacar(arquero); // 10 de vida tiene armadura de cuero
		assertEquals("Soy el Arquero Ashe y me queda 90 de vida.",arquero.toString());
		thoor.atacar(thoor); //7 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thor y me queda 93 de vida.",thoor.toString());
		thoor.atacar(guerrero); // 5 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Riven y me queda 95 de vida.",guerrero.toString());
	}
	


}

