package ar.edu.unlp.info.oo2.ejercicio15_EstacionMeteorologica;

public class RadiacionDecorador extends TemperaturaDecorador {
	
	public RadiacionDecorador(Temperatura componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Radiación solar: " + Math.round(this.getRadiacionSolar());
	}

}
