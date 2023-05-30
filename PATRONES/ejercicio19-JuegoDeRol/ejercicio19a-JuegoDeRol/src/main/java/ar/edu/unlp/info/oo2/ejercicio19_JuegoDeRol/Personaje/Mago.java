package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.ArmaBaston;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.ArmaduraCuero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.CombateADistancia;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.Magia;

public class Mago extends Personaje{

	public Mago(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}

	@Override
	public String getTipo() {
		return "Mago";
	}

}
