package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class ConstructorSandwichVegetariano implements Constructor{
	private Sandwich sandwich;
	
	public ConstructorSandwichVegetariano() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void reset() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void agregarPan() {
		this.sandwich.setPan(120);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(0);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(200);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(100);
	}
	
	@Override
	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}
}
