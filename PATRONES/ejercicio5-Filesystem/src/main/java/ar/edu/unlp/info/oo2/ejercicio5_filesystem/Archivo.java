package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;

public class Archivo extends FileSystem{
	private int tamano;
	
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha);
		this.tamano = tamano;
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
}
