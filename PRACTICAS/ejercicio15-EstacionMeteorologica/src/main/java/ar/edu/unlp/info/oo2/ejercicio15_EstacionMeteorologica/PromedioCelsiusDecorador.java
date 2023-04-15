package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class PromedioCelsiusDecorador extends TemperaturaDecorador{
	
	public PromedioCelsiusDecorador(Temperatura componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas C: " + Math.round(this.getPromedioCelsius());
	}
	
	public double getPromedioCelsius() {
		return this.convertirCelsius((this.getTemperaturasFahrenheit().stream().mapToDouble(temp -> temp).sum())/this.getTemperaturasFahrenheit().size());	
	}
	
	private double convertirCelsius(double temperatura) {
		return ((temperatura - 32)/ 1.8 );
	}
}