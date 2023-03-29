package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

public class Planta extends Empleado{
	private int aniosAntiguedad;

	public Planta(int cantidadHijos, boolean casado, int aniosAntiguedad) {
		super(cantidadHijos, casado);
		this.aniosAntiguedad = aniosAntiguedad;
	}

	@Override
	public double sueldoBasico() {
		return 50000;
	}

	@Override
	public double sueldoAdicional() {
		double sum = this.getCantidadHijos() * 2000 + this.aniosAntiguedad * 2000;
		return this.isCasado()? sum + 5000 : sum;
	}
}
