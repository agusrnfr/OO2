package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();
	
	public boolean agregarTelefono(String telefono) {
		if (!guiaTelefonica.contains(telefono)) {
			guiaTelefonica.add(telefono);
			return true;
		}
		return false;
	}
	
	private String extraerUltimoTelefono() {
		String telefono = guiaTelefonica.last();
		guiaTelefonica.remove(telefono);
		return telefono;
	}
	
	public Persoona registrarUsuarioFisica(String documento, String nombre) {
		PersoonaFisica persona = new PersoonaFisica(nombre, extraerUltimoTelefono(), documento);
		personas.add(persona);
		return persona;
	}
	
	public Persoona registrarUsuarioJuridica(String cuit, String nombre) {
		PersoonaJuridica persona = new PersoonaJuridica(nombre, extraerUltimoTelefono(), cuit);
		personas.add(persona);
		return persona;
	}
	
	public boolean eliminarUsuario(Persoona usuario) {
		boolean borreUsuario = personas.remove(usuario);
		if (borreUsuario) this.guiaTelefonica.add(usuario.getTelefono());
		return borreUsuario;
	}
	
	public Llamada registrarLlamadaNacional(Persoona emisor, Persoona remitente, int duracion) {
		return emisor.registrarLlamadaNacional(remitente, duracion);
	}
	
	public Llamada registrarLlamadaInternacional(Persoona emisor, Persoona remitente, int duracion) {
		return emisor.registrarLlamadaInternacional(remitente, duracion);
	}
	
	private Persoona buscarPersoonaEnPersoonal(Persoona persona) {
		return personas.stream().filter(usuario -> usuario.getTelefono() == persona.getTelefono()).findFirst().orElse(new PersoonaNull());
	}	
	
	public double calcularMontoTotalLlamadas(Persoona persona) {
			return buscarPersoonaEnPersoonal(persona).calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}

	public List<Persoona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persoona> personas) {
		this.personas = personas;
	}

	public SortedSet<String> getGuiaTelefonica() {
		return guiaTelefonica;
	}

	public void setGuiaTelefonica(SortedSet<String> guiaTelefonica) {
		this.guiaTelefonica = guiaTelefonica;
	}
}
