package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	@SuppressWarnings("unused")
	private String numeroDeEmisor;
	private String numeroDeRemitente;
	private int duracion;
	
	public Llamada() {
		
	}
	
	public Llamada(String numeroDeEmisor, String numeroDeRemitente, int duracion) {
		this.numeroDeEmisor= numeroDeEmisor;
		this.numeroDeRemitente= numeroDeRemitente;
		this.duracion = duracion;
	}

	public abstract double calcularCostoLlamada();
	
	public void setNumeroDeEmisor(String numeroDeEmisor) {
		this.numeroDeEmisor = numeroDeEmisor;
	}
	public String getNumeroDeRemitente() {
		return numeroDeRemitente;
	}
	public void setNumeroDeRemitente(String numeroDeRemitente) {
		this.numeroDeRemitente = numeroDeRemitente;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
