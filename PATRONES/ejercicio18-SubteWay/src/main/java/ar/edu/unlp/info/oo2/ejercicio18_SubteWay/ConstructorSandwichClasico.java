package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class ConstructorSandwichClasico implements Constructor{
	private Sandwich sandwich;
	
	public ConstructorSandwichClasico() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void reset() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void agregarPan() {
		this.sandwich.setPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(20);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(300);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(80);
	}

	@Override
	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}
}

