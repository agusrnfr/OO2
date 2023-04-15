package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class CelsiusDecorador extends TemperaturaDecorador {

	public CelsiusDecorador(Temperatura componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C: " + Math.round(this.getTemperturaCelsius());
	}
	
	public double getTemperturaCelsius(){
		return ((this.getTemperaturaFahrenheit() - 32)/ 1.8 );
	}
}
