package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;

public abstract class Estructura{
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	public Estructura(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
    public abstract Archivo archivoMasGrande(); 
    
    public abstract Archivo archivoMasNuevo();
}
