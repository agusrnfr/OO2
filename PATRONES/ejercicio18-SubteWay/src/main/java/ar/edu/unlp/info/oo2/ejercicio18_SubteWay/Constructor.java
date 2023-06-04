package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public abstract class Constructor {
	private Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
}
