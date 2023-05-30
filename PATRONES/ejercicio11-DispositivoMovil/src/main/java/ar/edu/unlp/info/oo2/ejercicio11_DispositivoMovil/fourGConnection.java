package ar.edu.unlp.info.oo2.ejercicio11_DispositivoMovil;

public class fourGConnection {
	private String symb;

	public fourGConnection() {
		this.symb = "Simbolo 4G";
	}
	
	public String symb() {
		return symb;
	}

	public String transmit (String data, long crc) {
		return "transmitting data with 4G Connection";
	}

}
