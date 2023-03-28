package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;

public abstract class Estructura {
	private String nombre;
	private LocalDate fecha;
	private int tamaño;
	
	
	public Estructura(String nombre, LocalDate fecha, int tamaño) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamaño = tamaño;
	}
	
	
	public int tamañoTotalOcupado() {
		return this.tamaño;
	}
	

}
