package ar.edu.unlp.info.oo1.ejercicio21_GenealogiaSalvaje;

import java.time.LocalDate;

public class RealMamifero implements Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public RealMamifero() {
		
	}

	public RealMamifero(String identificador, String especie, LocalDate fechaNacimiento) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public RealMamifero(String identificador) {
		this.identificador = identificador;
	}

	public RealMamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero madre, Mamifero padre) {
		super();
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.madre = madre;
		this.padre = padre;
	}

	@Override
	public String getIdentificador() {
		return this.identificador;
	}

	@Override
	public void setIdentificador(String id) {
		this.identificador = id;
	}

	@Override
	public String getEspecie() {
		return this.especie;
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public LocalDate getFechaDeNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public void setFechaDeNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	@Override
	public Mamifero getPadre() {
		return this.padre;
	}

	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	@Override
	public Mamifero getMadre() {
		return this.padre;
	}

	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (tieneAncestro(this.getMadre(), unMamifero) || tieneAncestro(this.getPadre(),unMamifero));
	}
	
	private boolean tieneAncestro(Mamifero parent, Mamifero unMamifero) {
		return (unMamifero.equals(parent) || parent.tieneComoAncestroA(unMamifero));
	}

	
}
