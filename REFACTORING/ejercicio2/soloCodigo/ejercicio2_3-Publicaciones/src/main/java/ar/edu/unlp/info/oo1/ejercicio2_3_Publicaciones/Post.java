package ar.edu.unlp.info.oo1.ejercicio2_3_Publicaciones;

import java.time.LocalDateTime;

public class Post {
	private String texto;
	private LocalDateTime fecha;
	private Usuario usuario;
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public boolean esPostDeOtroUsuario(Usuario usuario) {
		return !this.getUsuario().equals(usuario);
	}
	
	
}
