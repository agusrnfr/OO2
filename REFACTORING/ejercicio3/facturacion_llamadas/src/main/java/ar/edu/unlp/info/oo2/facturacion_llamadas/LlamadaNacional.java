package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(String numeroDeEmisor, String numeroDeRemitente, int duracion) {
		super(numeroDeEmisor, numeroDeRemitente, duracion);
	}

	public double calcularCostoLlamada() {
		return this.getDuracion()*3 + (this.getDuracion()*3*0.21);
	}

}
