package ar.edu.unlp.info.oo2.ejercicio12_DecodificadorPeliculas;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	
	public List<Pelicula> obtenerSugerencias(Decodificador decodificador){
		return this.sugerirPeliculas(decodificador).stream()
				.filter(pelicula -> !decodificador.getReproducidas().contains(pelicula))
				.limit(3).collect(Collectors.toList());
	
	}
	
	public abstract List<Pelicula> sugerirPeliculas(Decodificador decodificador);
}
