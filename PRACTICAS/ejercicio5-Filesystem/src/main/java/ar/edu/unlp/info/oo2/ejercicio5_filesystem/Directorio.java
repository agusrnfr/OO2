package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Estructura {
	private List<Estructura> contenido;

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		this.contenido = new ArrayList<>();
	}
	
	public int tamañoTotalOcupado() {
		return super.tamañoTotalOcupado() + this.contenido.stream().mapToInt(estructura -> estructura.tamañoTotalOcupado()).sum();
	}
	

}
