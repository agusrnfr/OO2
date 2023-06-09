package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona {
	private String cuit;
	private static double descuentoJuridica = 0.15;

	public PersoonaJuridica(String nombre, String telefono, String cuit) {
		super(nombre, telefono);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public static double getDescuentoJuridica() {
		return descuentoJuridica;
	}

	public static void setDescuentoJuridica(double descuentoJuridica) {
		PersoonaJuridica.descuentoJuridica = descuentoJuridica;
	}
	
	public double calcularDescuentoPersoona(double costo) {
		return costo*PersoonaJuridica.getDescuentoJuridica();
	}
}
