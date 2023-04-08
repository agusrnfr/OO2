package ar.edu.unlp.info.oo2.ejercicio11_DispositivoMovil;

public class fourGAdapter implements Connection{
	private fourGConnection adaptee;

	public fourGAdapter() {
		this.adaptee = new fourGConnection();
	}

	@Override
	public String sendData(String data, long crc) {
		return adaptee.transmit(data,crc);
	}

	@Override
	public String pict() {
		return adaptee.symb();
	}
	
	

}
