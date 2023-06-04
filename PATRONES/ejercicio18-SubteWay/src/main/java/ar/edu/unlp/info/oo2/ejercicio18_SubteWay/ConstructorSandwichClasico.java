package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class ConstructorSandwichClasico extends Constructor{

	@Override
	public void agregarPan() {
		this.obtenerSandwich().setPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.obtenerSandwich().setAderezo(20);
	}

	@Override
	public void agregarPrincipal() {
		this.obtenerSandwich().setPrincipal(300);
	}

	@Override
	public void agregarAdicional() {
		this.obtenerSandwich().setAdicional(80);
	}
}

