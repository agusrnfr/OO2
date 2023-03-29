package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;

public class Archivo extends Estructura{
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha, tamano);
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
}
