package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.ArmaBaston;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.ArmaduraCuero;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.CombateADistancia;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Magia;

public class Mago extends Personaje{

	public Mago(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}

	@Override
	public String getTipo() {
		return "Mago";
	}

}
