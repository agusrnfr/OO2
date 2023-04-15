package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

import java.util.List;

public class TemperaturaDecorador implements Temperatura {
	private Temperatura componente;
	
	public TemperaturaDecorador(Temperatura componente) {
		this.componente = componente;
	}

	@Override
	public String displayData() {
		return this.componente.displayData();
	}

	@Override
	public double getTemperaturaFahrenheit() {
		return this.componente.getTemperaturaFahrenheit();
	}

	@Override
	public double getPresion() {
		return this.componente.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		return this.componente.getTemperaturasFahrenheit();
	}
}
