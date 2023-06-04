package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class ConstructorSandwichVegetariano extends Constructor{

	@Override
	public void agregarPan() {
		this.obtenerSandwich().setPan(120);
	}

	@Override
	public void agregarAderezo() {
		this.obtenerSandwich().setAderezo(0);
	}

	@Override
	public void agregarPrincipal() {
		this.obtenerSandwich().setPrincipal(200);
	}

	@Override
	public void agregarAdicional() {
		this.obtenerSandwich().setAdicional(100);
	}
	
}
