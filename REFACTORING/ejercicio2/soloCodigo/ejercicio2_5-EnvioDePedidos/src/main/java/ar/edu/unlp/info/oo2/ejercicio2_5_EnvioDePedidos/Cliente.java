package ar.edu.unlp.info.oo2.ejercicio2_5_EnvioDePedidos;

public class Cliente {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;

	public String getDireccionFormateada() {
		return this.localidad + ", " + this.calle + ", " + this.numero + ", " + this.departamento;
	}

}
