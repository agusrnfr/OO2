package ar.edu.unlp.info.oo1.ejercicio3_MediaPlayer;

public class VideoStreamAdapter extends Media {
	private VideoStream adaptee;

	@Override
	public String play() {
		return adaptee.reproduce();
	}

}
