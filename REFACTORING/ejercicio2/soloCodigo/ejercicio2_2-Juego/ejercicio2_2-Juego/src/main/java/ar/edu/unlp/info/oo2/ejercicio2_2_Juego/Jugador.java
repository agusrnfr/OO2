package ar.edu.unlp.info.oo2.ejercicio2_2_Juego;

public class Jugador {
	private String nombre;
    private String apellido;
    private int puntuacion;
    
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntuacion = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
    public void incrementarPuntuacion() {
        this.puntuacion += 100;
    }
    
    public void decrementarPuntuacion() {
    	this.puntuacion -= 50;
    }

}


