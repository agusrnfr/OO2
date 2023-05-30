package ar.edu.unlp.info.oo1.ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public List<Tweet> getTweets() {
		return this.tweets;
	}

	public void realizarTweet(String texto) {
		if (verificarLongitud(texto)) {
		Tweet tweet = new Tweet (texto);
		this.tweets.add(tweet);
		}	
		
	}
	
	public void realizarRetweet(String texto, Tweet tweetOriginal) {
		if (verificarLongitud(texto)) {
			Tweet tweet = new Retweet (texto,tweetOriginal);
			this.tweets.add(tweet);	
		}
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	private boolean verificarLongitud(String texto) {
		return (texto.length() >= 1) && (texto.length() <= 280);
	}
	
}
