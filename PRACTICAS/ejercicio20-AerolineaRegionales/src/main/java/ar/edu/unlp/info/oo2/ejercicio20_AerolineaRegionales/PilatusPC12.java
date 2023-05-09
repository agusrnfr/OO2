package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegionales;

public abstract class PilatusPC12 {
	private int carga;
	private int cantPasajeros;
	
	public PilatusPC12(int cantPasajeros) {
		this.carga = 1500;
		this.cantPasajeros = cantPasajeros;
	}

	public int getCarga() {
		return carga;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}
	
	
}
