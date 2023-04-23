package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class ConstructorSandwich implements Constructor{
	private Sandwich sandwich;
	
	public ConstructorSandwich() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void reset() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void agregarPan(double precio) {
		this.sandwich.setPan(precio);
	}

	@Override
	public void agregarAderezo(double precio) {
		this.sandwich.setAderezo(precio);
	}

	@Override
	public void agregarPrincipal(double precio) {
		this.sandwich.setPrincipal(precio);
	}

	@Override
	public void agregarAdicional(double precio) {
		this.sandwich.setAdicional(precio);
	}

	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}
}
