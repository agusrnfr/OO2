package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.FactoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.ArmaBaston;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.ArmaduraCuero;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.CombateADistancia;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Magia;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Mago;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Personaje;

public class CreadorMago extends PersonajeFactory{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateADistancia());
		lista.add(new Magia());
		return new Mago("Syndra", new ArmaduraCuero(), new ArmaBaston(), lista);
	}

}
