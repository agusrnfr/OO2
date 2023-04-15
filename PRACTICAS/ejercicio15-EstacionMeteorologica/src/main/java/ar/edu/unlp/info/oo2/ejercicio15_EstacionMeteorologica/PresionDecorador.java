package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class PresionDecorador extends TemperaturaDecorador {
	
	public PresionDecorador(Temperatura componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Presión atmosférica: " + Math.round(this.getPresion());
	}
}
