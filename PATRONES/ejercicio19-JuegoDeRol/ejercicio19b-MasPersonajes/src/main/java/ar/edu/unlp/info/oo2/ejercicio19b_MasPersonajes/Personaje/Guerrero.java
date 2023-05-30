package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.ArmaEspada;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.ArmaduraAcero;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.CombateCuerpoACuerpo;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;

public class Guerrero extends Personaje {
	
	public Guerrero (String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}

	@Override
	public String getTipo() {
		return "Guerrero";
	}

	
}
