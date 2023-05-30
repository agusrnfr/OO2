package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.FactoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.ArmaEspada;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.ArmaduraAcero;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.CombateCuerpoACuerpo;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Guerrero;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Personaje;

public class CreadorGuerrero extends PersonajeFactory{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateCuerpoACuerpo());
		return new Guerrero("Riven", new ArmaduraAcero(), new ArmaEspada(), lista);
	}

}
