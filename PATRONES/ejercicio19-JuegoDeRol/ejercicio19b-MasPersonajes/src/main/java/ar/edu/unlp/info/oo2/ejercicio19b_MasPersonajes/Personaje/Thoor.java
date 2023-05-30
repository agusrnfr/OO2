package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje;

import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.Arma;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.Armadura;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;

public class Thoor extends Personaje{
	public Thoor(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}

	@Override
	public String getTipo() {
		return "Thoor";
	}

}
