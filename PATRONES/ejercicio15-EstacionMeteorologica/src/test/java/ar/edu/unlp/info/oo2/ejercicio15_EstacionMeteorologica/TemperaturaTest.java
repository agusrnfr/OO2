package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {
	private HomeWeatherStation estacion;
	private HomeWeatherStationAdapter adaptador;
	private PresionDecorador presion;
	private RadiacionDecorador radiacion; 
	private CelsiusDecorador celsius;
	private PromedioCelsiusDecorador promedioCelsius;
	private PromedioFahrenheitDecorador promedioFahrenheit;

	@BeforeEach
	public void setUp() throws Exception {
		//23.5 + 23.5 + 30
		this.estacion = new HomeWeatherStation(82.4, 1008, 500);
		this.estacion.addTemperaturasFahrenheit(70);
		this.estacion.addTemperaturasFahrenheit(80);
		this.estacion.addTemperaturasFahrenheit(81);
		this.adaptador = new HomeWeatherStationAdapter(estacion);
	}

	@Test
	public void testDisplayDataOpcion2() {
		//Ejemplo 2:    “Presión atmosférica: 1008  Radiación solar: 500”
		this.presion = new PresionDecorador(adaptador);
		this.radiacion = new RadiacionDecorador(this.presion);
		
		assertEquals(" Presión atmosférica: 1008 Radiación solar: 500",this.radiacion.displayData());
		
	}

	@Test
	public void testDisplayDataOpcion3() {
		//Ejemplo 3: “Radiación solar: 500  Temperatura C: 28  Promedio de temperaturas C: 25”
		this.radiacion = new RadiacionDecorador(adaptador);
		this.celsius = new CelsiusDecorador(radiacion);
		this.promedioCelsius = new PromedioCelsiusDecorador(celsius);
		
		assertEquals(" Radiación solar: 500 Temperatura C: 28 Promedio de temperaturas C: 25" ,this.promedioCelsius.displayData());

	}
}
