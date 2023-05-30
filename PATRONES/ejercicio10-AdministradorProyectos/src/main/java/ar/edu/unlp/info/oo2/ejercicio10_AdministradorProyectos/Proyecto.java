package ar.edu.unlp.info.oo2.ejercicio10_AdministradorProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private Etapa etapa;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margenGanancias;
	private int cantIntegrantes;
	private double montoPagoPorIntegrantes;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo,
			int cantIntegrantes, double montoPagoPorIntegrantes) {
		this.nombre = nombre;
		this.etapa = new EnConstruccion(this);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margenGanancias = 0.07;
		this.cantIntegrantes = cantIntegrantes;
		this.montoPagoPorIntegrantes = montoPagoPorIntegrantes;
	}
	
	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public String getObjetivo() {
		return this.objetivo;
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa();
	}
	
	public double costoProyecto() {
		return this.cantIntegrantes * this.montoPagoPorIntegrantes * ChronoUnit.DAYS.between(this.fechaInicio,this.fechaFin);
	}
	
	public double precioProyecto() {
		return this.costoProyecto() + this.costoProyecto() * this.margenGanancias;
	}
	
	public void modificarMargenDeGanancias(double margen) {
		if (this.etapa.modificarMargenDeGanancias(margen)) {
			this.margenGanancias = margen;
		}
	}
	
	public void cancelarProyecto() {
		if (!this.objetivo.contains("(Cancelado)")) {
			this.objetivo+= " (Cancelado)";
		}
	}
	
	

}
