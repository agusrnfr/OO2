package ar.edu.unlp.info.oo2.ejercicio2_1_Empleados;

public class EmpleadoTemporario extends Empleado{
	private double horasTrabajadas;
	private int cantidadHijos;

	public EmpleadoTemporario(String nombre, String apellido) {
		super(nombre,apellido);
		this.horasTrabajadas = 0;
		this.cantidadHijos = 0;
	}

	public double calcularSueldo() {
    	return this.sueldoBasico + (this.horasTrabajadas * 500)  + (this.cantidadHijos * 1000) - (this.sueldoBasico * 0.13);
    	  
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

}
