package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.ArmaEspada;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.ArmaduraAcero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.CombateCuerpoACuerpo;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.Habilidad;

public class Guerrero extends Personaje {
	
	public Guerrero (String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}

	@Override
	public String getTipo() {
		return "Guerrero";
	}

	
}
