package ar.edu.unlp.info.oo2.ejercicio12_DecodificadorPeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad extends Sugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getReproducidas().stream().map(pelicula -> pelicula.getPeliculasSimilares()).flatMap(lista -> lista.stream()).distinct().collect(Collectors.toList());
	} 
}
