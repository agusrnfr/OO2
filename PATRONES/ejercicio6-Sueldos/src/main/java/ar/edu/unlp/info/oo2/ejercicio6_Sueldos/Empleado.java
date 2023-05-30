package ar.edu.unlp.info.oo2.ejercicio6_Sueldos;

public abstract class Empleado {
	private int cantidadHijos;
	private boolean casado;
	
	public Empleado(int cantidadHijos, boolean casado) {
		this.cantidadHijos = cantidadHijos;
		this.casado = casado;
	}
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	public double descuento(){
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.5;
	}
	
	
	public int getCantidadHijos() {
		return this.cantidadHijos;
	}

	public boolean isCasado() {
		return this.casado;
	}

	public abstract double sueldoBasico();
	public abstract double sueldoAdicional();
}
