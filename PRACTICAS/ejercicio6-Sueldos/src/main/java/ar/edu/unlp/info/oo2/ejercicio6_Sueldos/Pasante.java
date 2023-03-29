package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

public class Pasante extends Empleado {
	private int cantidadExamen;

	public Pasante(int cantidadHijos, boolean casado, int cantidadExamen) {
		super(cantidadHijos, casado);
		this.cantidadExamen = cantidadExamen;
	}

	@Override
	public double sueldoBasico() {
		return 20000;
	}

	@Override
	public double sueldoAdicional() {
		return this.cantidadExamen * 2000;
	}
}
