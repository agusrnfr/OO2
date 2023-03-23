package ar.edu.unlp.info.oo1.ejercicio1_RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {
	
	Twitter twitter;
	
	Usuario usuarioAEliminar;
	
	Tweet tweetOriginal;
	Tweet tweet1;
	Tweet tweet2;
	Tweet tweet3;

	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		usuarioAEliminar = new Usuario ("Amy Lee");
		tweetOriginal = new Tweet ("Este es un tweet Original");
		usuarioAEliminar.realizarTweet("Tweet1");
		usuarioAEliminar.realizarTweet("Tweet2");
		usuarioAEliminar.realizarRetweet("Este es un retweet", tweetOriginal);
		
	}

	@Test
	void testCargarUsuario() {
		twitter.cargarUsuario("Lana Del Rey");
		twitter.cargarUsuario("Taylor Swift");
		twitter.cargarUsuario("Taylor Swift");
		twitter.cargarUsuario("Lana Del Rey");
		assertEquals(2,twitter.getUsuarios().size());
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(3,usuarioAEliminar.getTweets().size());
		twitter.eliminarUsuario(usuarioAEliminar);
		assertEquals(0,usuarioAEliminar.getTweets().size());
		
	}

}
