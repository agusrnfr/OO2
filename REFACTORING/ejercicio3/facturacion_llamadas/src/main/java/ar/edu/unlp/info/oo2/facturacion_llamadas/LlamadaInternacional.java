package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String numeroDeEmisor, String numeroDeRemitente, int duracion) {
		super(numeroDeEmisor, numeroDeRemitente, duracion);
	}

	public double calcularCostoLlamada() {
		return this.getDuracion() *200 + (this.getDuracion()*200*0.21);
	}

}
