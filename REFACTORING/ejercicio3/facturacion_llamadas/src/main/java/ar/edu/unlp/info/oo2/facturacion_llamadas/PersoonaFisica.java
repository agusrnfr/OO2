package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona {
	private String documento;
	private static double descuentoFisica = 0;

	public PersoonaFisica(String nombre, String telefono, String documento) {
		super(nombre, telefono);
		this.documento = documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public static double getDescuentoFisica() {
		return descuentoFisica;
	}

	public static void setDescuentoFisica(double descuentoFisica) {
		PersoonaFisica.descuentoFisica = descuentoFisica;
	}
	
	public double calcularDescuentoPersoona(double costo) {
		return costo*PersoonaFisica.getDescuentoFisica();
	}
}
