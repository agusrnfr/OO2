package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class FahrenheitDecorador extends TemperaturaDecorador {
	
	public FahrenheitDecorador(Temperatura componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura F: " + Math.round(this.getTemperaturaFahrenheit());
	}
}
