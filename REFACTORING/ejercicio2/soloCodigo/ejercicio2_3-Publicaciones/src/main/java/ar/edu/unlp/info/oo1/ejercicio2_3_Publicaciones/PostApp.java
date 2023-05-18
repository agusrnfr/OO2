package ar.edu.unlp.info.oo1.ejercicio2_3_Publicaciones;

import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
	private List<Post> posts;

	public List<Post> ultimosPostsQueNoPertenecenAUsuario(Usuario usuario, int cantidad) {
        
	   List<Post> postsOtrosUsuarios = obtenerPostsOtrosUsuarios(usuario);
	   postsOtrosUsuarios = ordenarPostsPorFecha(postsOtrosUsuarios);
	   return obtenerUltimosNPosts(cantidad, postsOtrosUsuarios);
	}

	private List<Post> obtenerPostsOtrosUsuarios(Usuario usuario) {
	    return this.posts.stream()
	            .filter(post -> post.esPostDeOtroUsuario(usuario))
	            .collect(Collectors.toList());
	}

	private List<Post> ordenarPostsPorFecha(List<Post> postsOtrosUsuarios) {
		return postsOtrosUsuarios.stream().sorted((p1,p2) -> p1.getFecha().compareTo(p2.getFecha())).collect(Collectors.toList());
	}

	private List<Post> obtenerUltimosNPosts(int cantidad, List<Post> postsOtrosUsuarios) {
	    return postsOtrosUsuarios.stream()
	            .limit(cantidad)
	            .collect(Collectors.toList());
	}

	
}
