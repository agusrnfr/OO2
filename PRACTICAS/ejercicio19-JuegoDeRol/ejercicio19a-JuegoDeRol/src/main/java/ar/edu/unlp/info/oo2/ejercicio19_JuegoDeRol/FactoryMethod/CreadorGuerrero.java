package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.FactoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.ArmaEspada;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.ArmaduraAcero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.CombateCuerpoACuerpo;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje.Guerrero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje.Personaje;

public class CreadorGuerrero extends PersonajeFactory{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateCuerpoACuerpo());
		return new Guerrero("Riven", new ArmaduraAcero(), new ArmaEspada(), lista);
	}

}
