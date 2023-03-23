package ar.edu.unlp.info.oo1.ejercicio1_RedSocial;

public class Retweet extends Tweet {
	private Tweet tweetOriginal;

	public Retweet(String texto, Tweet tweetOriginal) {
		super(texto);
		this.tweetOriginal = tweetOriginal;
	}
	
	@Override
	public String getTexto() {
		return "Tweet Original" + tweetOriginal.getTexto() + "Cita retweet" + this.getTexto();
	}

}
