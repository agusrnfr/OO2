package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String telefono;
	
	public Persoona() {};
	
	public Persoona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public abstract double calcularDescuentoPersoona(double costo);
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Llamada registrarLlamadaNacional(Persoona remitente, int duracion) {
		Llamada llamada = new LlamadaNacional(this.getTelefono(), remitente.getTelefono(), duracion);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInternacional(Persoona remitente, int duracion) {
		Llamada llamada = new LlamadaInternacional(this.getTelefono(), remitente.getTelefono(), duracion);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream().mapToDouble(llamada -> {
                    double costo = llamada.calcularCostoLlamada();
                    return costo - this.calcularDescuentoPersoona(costo);
                }).reduce(0, Double::sum);
	}
}
