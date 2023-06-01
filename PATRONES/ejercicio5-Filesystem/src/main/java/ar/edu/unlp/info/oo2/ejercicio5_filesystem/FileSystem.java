package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;

public abstract class FileSystem{
	private String nombre;
	private LocalDate fecha;
	
	public FileSystem(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract int tamanoTotalOcupado();
	
    public abstract Archivo archivoMasGrande(); 
    
    public abstract Archivo archivoMasNuevo();
}
