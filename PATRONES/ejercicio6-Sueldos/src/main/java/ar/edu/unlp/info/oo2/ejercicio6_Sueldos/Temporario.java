package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

public class Temporario extends Empleado{
	private int cantidadHoras;

	public Temporario(int cantidadHijos, boolean casado, int cantidadHoras) {
		super(cantidadHijos, casado);
		this.cantidadHoras = cantidadHoras;
	}

	@Override
	public double sueldoBasico() {
		return 20000 + this.cantidadHoras * 300 ;
	}

	@Override
	public double sueldoAdicional() {
		double sum = this.getCantidadHijos() * 2000;
		return this.isCasado()? sum + 5000 : sum;
	}
}
