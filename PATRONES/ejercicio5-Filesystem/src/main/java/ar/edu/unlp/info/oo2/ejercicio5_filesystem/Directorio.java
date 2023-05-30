package ar.edu.unlp.info.oo2.ejercicio5_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Archivo {
	private List<Archivo> contenido;

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		this.contenido = new ArrayList<>();
	}
	
	public void agregar(Archivo archivo) {
		this.contenido.add(archivo);	
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return super.tamanoTotalOcupado() + this.contenido.stream().mapToInt(estructura -> estructura.tamanoTotalOcupado()).sum();
	}
	
	
	@Override
    public Archivo archivoMasGrande() {
    	return this.contenido.stream().map(estructura -> estructura.archivoMasGrande()).max((a1,a2) -> Integer.compare(a1.archivoMasGrande().tamanoTotalOcupado(),a2.archivoMasGrande().tamanoTotalOcupado())).orElse(null);	
    }
    
	@Override
    public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(estructura -> estructura.archivoMasNuevo()).max((a1,a2) -> a1.archivoMasNuevo().getFecha().compareTo(a2.archivoMasNuevo().getFecha())).orElse(null);
    }
}
