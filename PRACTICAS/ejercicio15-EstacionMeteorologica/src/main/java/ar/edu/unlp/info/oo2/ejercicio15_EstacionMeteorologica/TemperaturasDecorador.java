package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class TemperaturasDecorador extends TemperaturaDecorador {
	
	public TemperaturasDecorador(Temperatura componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + " Lista de Temperaturas F: " + this.getTemperaturasFahrenheit().toString();
	}

}
