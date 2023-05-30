package ar.edu.unlp.info.oo2.ejercicio4b_Topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio4b_Topografias.Agua;
import ar.edu.unlp.info.oo2.ejercicio4b_Topografias.Tierra;
import ar.edu.unlp.info.oo2.ejercicio4b_Topografias.Topografia;
import ar.edu.unlp.info.oo2.ejercicio4b_Topografias.TopografiaMixta;

public class TopografiaTest {
	
	private Topografia agua;
	private Topografia tierra;
	private Topografia pantano;
	private Topografia mixta1;
	private Topografia mixta2;
	private Topografia mixtaPantano1;
	private Topografia mixtaPantano2;
	

	@BeforeEach
	public void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixta1 = new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),new Agua());
		mixta2 = new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),mixta1);
		mixtaPantano1 = new TopografiaMixta(new Agua(),new Pantano(),new Tierra(),new Pantano());
		mixtaPantano2 = new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),mixtaPantano1);
	}

	@Test
	public void testGetProporcionTierra() {
		assertEquals(1,tierra.getProporcionTierra());
		assertEquals(0,agua.getProporcionTierra());
		assertEquals(0.3,pantano.getProporcionTierra(),0.00000000000000010); //NO SE PORQUE ME DA 0.30000000000000004 rarisimo eh
		assertEquals(0.5,mixta1.getProporcionTierra());
		assertEquals(0.625,mixta2.getProporcionTierra());
		assertEquals(0.4,mixtaPantano1.getProporcionTierra());
		assertEquals(0.6,mixtaPantano2.getProporcionTierra());
	}
	
	@Test
	public void testGetProporcionAgua() {
		assertEquals(0,tierra.getProporcionAgua());
		assertEquals(1,agua.getProporcionAgua());
		assertEquals(0.7,pantano.getProporcionAgua());
		assertEquals(0.5,mixta1.getProporcionAgua());
		assertEquals(0.375,mixta2.getProporcionAgua());
		assertEquals(0.6,mixtaPantano1.getProporcionAgua());
		assertEquals(0.4,mixtaPantano2.getProporcionAgua());
	}
	
	@Test
	public void testIsEquals() {
		assertTrue(this.tierra.isEquals(new Tierra()));
		assertFalse(this.tierra.isEquals(new Agua()));
		assertFalse(this.tierra.isEquals(new Pantano()));
		assertTrue(this.agua.isEquals(new Agua()));
		assertFalse(this.agua.isEquals(new Tierra()));
		assertFalse(this.agua.isEquals(new Pantano()));
		assertTrue(this.pantano.isEquals(new Pantano()));
		assertFalse(this.pantano.isEquals(new Agua()));
		assertFalse(this.pantano.isEquals(new Tierra()));
		assertFalse(this.mixta1.isEquals(agua));
		assertFalse(this.mixta1.isEquals(mixta2));
		assertFalse(this.mixta1.isEquals(pantano));
		assertTrue(this.mixta1.isEquals(new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),new Agua())));
		assertTrue(this.mixta2.isEquals(new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),mixta1)));
		assertFalse(this.mixta2.isEquals(new TopografiaMixta(new Agua(),new Tierra(),mixta1,new Tierra())));
		assertFalse(this.mixtaPantano1.isEquals(agua));
		assertFalse(this.mixtaPantano1.isEquals(mixta2));
		assertFalse(this.mixtaPantano1.isEquals(pantano));
		assertTrue(this.mixtaPantano1.isEquals(new TopografiaMixta(new Agua(),new Pantano(),new Tierra(),new Pantano())));
		assertTrue(this.mixtaPantano2.isEquals(new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),mixtaPantano1)));
		assertFalse(this.mixtaPantano2.isEquals(new TopografiaMixta(new Agua(),new Tierra(),new Tierra(),mixta1)));
	}

}
