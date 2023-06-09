package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaNull extends Persoona {

	public PersoonaNull() {
		super();
	}

	public double calcularDescuentoPersoona(double costo) {
		return 0;
	}
	
	@Override
	public double calcularMontoTotalLlamadas() {
		return 0;
	}
}
