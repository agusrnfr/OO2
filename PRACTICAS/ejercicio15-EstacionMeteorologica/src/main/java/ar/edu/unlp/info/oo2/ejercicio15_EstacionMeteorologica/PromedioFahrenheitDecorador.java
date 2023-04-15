package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class PromedioFahrenheitDecorador extends TemperaturaDecorador {

	public PromedioFahrenheitDecorador(Temperatura componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas F: " + Math.round(this.getPromedioFahrenheit());
	}
	
	public double getPromedioFahrenheit() {
		return (this.getTemperaturasFahrenheit().stream().mapToDouble(temp -> temp).sum())/this.getTemperaturasFahrenheit().size();	
	}
}
