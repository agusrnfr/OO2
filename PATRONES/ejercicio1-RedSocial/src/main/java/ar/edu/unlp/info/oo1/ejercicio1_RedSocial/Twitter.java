package ar.edu.unlp.info.oo1.ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario cargarUsuario(String screenName) {
		if (noExisteUsuario(screenName)) {
		Usuario usuario = new Usuario(screenName);
		this.usuarios.add(usuario);
		return usuario;
		}
		return null;
		
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarTweets();
		this.usuarios.remove(usuario);
	}
	
	private boolean noExisteUsuario(String screenName) {
		return this.usuarios.stream().noneMatch(usuario -> usuario.getScreenName().equals(screenName));
	}
}
