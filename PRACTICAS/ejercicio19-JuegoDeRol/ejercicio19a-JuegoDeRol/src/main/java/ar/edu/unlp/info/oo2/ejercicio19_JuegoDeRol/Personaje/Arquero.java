package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.ArmaArco;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.ArmaduraCuero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.CombateADistancia;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.Habilidad;

public class Arquero extends Personaje{

	public Arquero(String nombre,  Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}

	@Override
	public String getTipo() {
		return "Arquero";
	}
	
}