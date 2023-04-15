package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

import java.util.List;

public interface Temperatura {
	
	public abstract String displayData();
	public abstract double getTemperaturaFahrenheit();
	public abstract double getPresion();
	public abstract double getRadiacionSolar();
	public abstract List<Double> getTemperaturasFahrenheit();
	

}
