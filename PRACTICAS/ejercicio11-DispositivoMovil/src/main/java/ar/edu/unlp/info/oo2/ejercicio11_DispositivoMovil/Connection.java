package ar.edu.unlp.info.oo2.ejercicio11_DispositivoMovil;

public interface Connection {
	
	public abstract String sendData (String data, long crc);
	public abstract String pict();

}
