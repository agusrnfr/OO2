package ar.edu.unlp.info.oo2.ejercicio2_1_Empleados;

public abstract class Empleado {

	protected String nombre;
	protected String apellido;
	protected double sueldoBasico;

    public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasico = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public abstract double calcularSueldo();


}