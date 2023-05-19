package ar.edu.unlp.info.oo2.ejercicio2_6_Peliculas;

public class SubscripcionPremium extends Subscripcion{

	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto() * 0.75;
	}

}
