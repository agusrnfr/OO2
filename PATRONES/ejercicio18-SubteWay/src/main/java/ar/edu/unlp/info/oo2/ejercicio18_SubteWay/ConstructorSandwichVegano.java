package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class ConstructorSandwichVegano implements Constructor{
	private Sandwich sandwich;
	
	public ConstructorSandwichVegano() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void reset() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void agregarPan () {
		this.sandwich.setPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(20);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(500);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(0);
	}

	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}
}