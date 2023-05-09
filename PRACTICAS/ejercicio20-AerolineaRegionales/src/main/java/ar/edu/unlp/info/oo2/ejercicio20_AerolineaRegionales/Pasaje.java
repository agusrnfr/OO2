package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegionales;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pasaje {
	private List<Integer> asientos;
	private Pasajero pasajero;
	private List<Vuelo> vuelos;
	private LocalDate dia;
	
	public Pasaje(List<Integer> asientos, Pasajero pasajero, List<Vuelo> vuelos, LocalDate dia) {
		this.asientos = asientos;
		this.pasajero = pasajero;
		this.vuelos = vuelos;
		this.dia = dia;
	}
	
	public double calcularValorPasaje() {
		return this.rateRoundTrip() * this.rateMultiHop() + this.rateDiario() * vuelos.stream().mapToDouble(vuelo -> vuelo.getCostoBase()).sum();
	}

	private double rateDiario() {
		if ((dia.getDayOfWeek().getValue() == 1) || (dia.getDayOfWeek().getValue() == 5)) {
			return 1;
		}
		if ((dia.getDayOfWeek().getValue() == 3)) {
			return 0.99;
		}
		
		if ((dia.getDayOfWeek().getValue() == 4)) {
			return 0.95;
		}
		
		return 1.01;
	}

	private double rateMultiHop() {
		String ciudadSalida= vuelos.get(0).getZonaSalida();
		String ciudadDestino= vuelos.get(vuelos.size()).getZonaDestino();
		
		if (ciudadSalida.equals(ciudadDestino)) {
			return 0.95;
		}
		
		return 1;
	}

	private double rateRoundTrip() {
	    Set<String> destinosUnicos = new HashSet<>();
	    for (Vuelo vuelo : vuelos) {
	        destinosUnicos.add(vuelo.getZonaDestino());
	    }
	    if (destinosUnicos.size() >= 3) {
	        return 0.93;
	    }
	    
	    return 1;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}
	
	public boolean poseeVuelo(Vuelo vuelo) {
		return this.vuelos.contains(vuelo);
	}
	
	public boolean estaEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {
	    return (this.dia.isEqual(fechaInicio) || this.dia.isAfter(fechaInicio)) &&
	           (this.dia.isEqual(fechaFin) || this.dia.isBefore(fechaFin));
	}

	
	
	
	
	
	

}
