package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegionales;

public class Pasajero {
	private String nombre;
	private String DNI;
	
	public Pasajero(String nombre, String dNI) {
		this.nombre = nombre;
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}
}
