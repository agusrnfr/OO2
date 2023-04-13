package ar.edu.unlp.info.oo2.ejercicio12_DecodificadorPeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNovedad extends Sugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getGrilla().stream().sorted((p2,p1) -> p1.getAnioEstreno().compareTo(p2.getAnioEstreno())).collect(Collectors.toList());
	}

}
