package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private Estado estado;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.estado = new Provisoria(this);
		this.inscriptos = new ArrayList<>();
		this.enEspera = new ArrayList<>();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
	}
	
	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return enEspera;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void inscribir (Usuario unUsuario) {
		this.estado.inscribir(unUsuario);
	}
	
	public boolean alcanzoMinimo() {
		return this.getInscriptos().size() >= this.cupoMinimo;
	}
	
	public boolean alcanzoMaximo() {
		return this.getInscriptos().size() >= this.cupoMaximo;
	}
	
	public String obtenerInformacion() {
		return "La excursion '" + this.nombre 
				+ "' tiene un costo de " + this.costo
				+ " con fecha de inicio " + this.fechaInicio.toString()
				+ " y fecha de fin " + this.fechaFin.toString()
				+ ".\nEl punto de encuentro es en '" + this.puntoEncuentro
				+ "'. " + this.estado.obtenerInformacion();
	}
	
	public String getMailsInscriptos() {
		return this.inscriptos.stream()
				.map(inscripto -> inscripto.getMail())
				.reduce("",(acumulator, element)-> acumulator +"\n" + element);
	}
}
