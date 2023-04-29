package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;



public abstract class Personaje {
	private String nombre;
	private int vida;
	private List<Habilidad> habilidades;
	private Armadura armadura;
	private Arma arma;
	
	public Personaje (String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		this.nombre = nombre;
		this.vida = 100;
		this.habilidades = habilidades;
		this.armadura = armadura;
		this.arma = arma;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public String getTipoArmadura() {
		return this.armadura.getTipo();
	}
	
	public abstract String getTipo();
	
	public boolean estaVivo() {
		return this.vida > 0;
	}
	
	public void atacar(Personaje objetivo) {
		objetivo.recibirAtaque(this.arma.calcularDanio(objetivo.getTipoArmadura()));
	}
	
	public void recibirAtaque (int danio) {
		if (this.estaVivo()) {
			 this.vida -= danio;
		}
		
	}
	
	@Override
	public String toString() {
		return "Soy el " + this.getTipo() + " " + this.getNombre() + " y me queda " + this.getVida() + " de vida.";
	}
	
}
