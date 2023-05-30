package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = new ArrayList<>();
	}

	public double getTemperaturaFahrenheit() {
		return this.temperatura;
	}
	
	public double getPresion() {
		return this.presion;
	}

	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	public List<Double> getTemperaturasFahrenheit() {
		return this.temperaturas;
	}
	
	public void addTemperaturasFahrenheit(double temperatura) {
		this.temperaturas.add(temperatura);
	}
}
