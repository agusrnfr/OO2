package ar.edu.unlp.info.oo2.ejercicio12_DecodificadorPeliculas;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private Year anioEstreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	
	public Pelicula(String titulo, double puntaje, Year anioEstreno) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<>();
	}


	public String getTitulo() {
		return titulo;
	}


	public Year getAnioEstreno() {
		return anioEstreno;
	}


	public double getPuntaje() {
		return puntaje;
	}
	
	public void establecerSimilitud(Pelicula pelicula) {
		if (!this.peliculasSimilares.contains(pelicula)) {
			this.peliculasSimilares.add(pelicula);
			pelicula.establecerSimilitud(this);
		}
	}
	
	public List<Pelicula> getPeliculasSimilares(){
		return this.peliculasSimilares;
	}

}
