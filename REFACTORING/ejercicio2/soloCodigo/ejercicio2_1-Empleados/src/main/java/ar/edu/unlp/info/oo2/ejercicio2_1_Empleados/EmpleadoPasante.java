package ar.edu.unlp.info.oo2.ejercicio2_1_Empleados;

public class EmpleadoPasante extends Empleado{
	
    public EmpleadoPasante(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public double calcularSueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
