package ar.edu.unlp.info.oo2.ejercicio2_1_Empleados;

public class EmpleadoPlanta extends Empleado{
	private int cantidadHijos;
	
    public EmpleadoPlanta(String nombre, String apellido) {
		super(nombre, apellido);
		this.cantidadHijos = 0;
	}

	public double calcularSueldo() {
		return this.sueldoBasico + (this.cantidadHijos * 2000) - (this.sueldoBasico * 0.13);
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
	
}