package ar.edu.unlp.info.oo2.ejercicio2_6_Peliculas;

import java.util.List;

public class Usuario {
	private String nombre;
	private int telefono;
	private String email;
	private List<Pelicula> peliculasCompradas;
	private Subscripcion tipoSubscripcion;

	public void setTipoSubscripcion(Subscripcion unTipo) {
		this.tipoSubscripcion = unTipo;
	}

	public double calcularCostoPelicula(Pelicula pelicula) {
		return tipoSubscripcion.calcularCostoPelicula(pelicula);
	}
}
