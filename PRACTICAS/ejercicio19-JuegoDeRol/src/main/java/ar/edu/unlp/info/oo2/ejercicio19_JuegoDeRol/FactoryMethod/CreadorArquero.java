package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.FactoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma.ArmaArco;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Armadura.ArmaduraCuero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.CombateADistancia;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje.Arquero;
import ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Personaje.Personaje;

public class CreadorArquero extends PersonajeFactory{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateADistancia());
		return new Arquero("Ashe", new ArmaduraCuero(), new ArmaArco(), lista);
	}
	

}
