package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

public class Usuario {
	private String nombre;
	private String apellido;
	private String mail;
	
	public Usuario(String nombre, String apellido, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getMail() {
		return mail;
	}
}
