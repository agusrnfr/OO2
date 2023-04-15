package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

import java.util.List;

public class HomeWeatherStationAdapter implements Temperatura {
	private HomeWeatherStation estacion;
	
	public HomeWeatherStationAdapter(HomeWeatherStation estacion) {
		this.estacion = estacion;
	}

	@Override
	public String displayData() {
		return "";
	}

	@Override
	public double getTemperaturaFahrenheit() {
		return this.estacion.getTemperaturaFahrenheit();
	}

	@Override
	public double getPresion() {
		return this.estacion.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.estacion.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		return this.estacion.getTemperaturasFahrenheit();
	}
}
