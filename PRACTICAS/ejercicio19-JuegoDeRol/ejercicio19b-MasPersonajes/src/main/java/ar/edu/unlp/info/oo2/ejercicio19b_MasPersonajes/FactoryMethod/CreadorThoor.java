package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma.ArmaMartillo;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Armadura.ArmaduraHierro;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.CombateADistancia;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.Habilidad;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Habilidad.LanzarRayos;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Personaje;
import ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Personaje.Thoor;

public class CreadorThoor extends PersonajeFactory{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateADistancia());
		lista.add(new LanzarRayos());
		return new Thoor("Thor", new ArmaduraHierro(), new ArmaMartillo(), lista);
	}
	
	

}
