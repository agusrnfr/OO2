package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegionales;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Pasaje> pasajes;
	private List<Vuelo> vuelos;

	public Empresa() {
		this.pasajes = new ArrayList<Pasaje>();
		this.vuelos = new ArrayList<Vuelo>();
	}
	
	public Vuelo agregarVuelo(PilatusPC12 avion,String zonaSalida, String zonaDestino, LocalTime salida, LocalTime destino, double costoBase) {
		Vuelo vuelo = new Vuelo(avion,zonaSalida,zonaDestino,salida,destino,costoBase); //no se si la voy a dejar
		this.vuelos.add(vuelo);
		return vuelo;
	}
	
	public Pasaje emitirPasaje(List<Integer> asientos, Pasajero pasajero, List<Vuelo> vuelos, LocalDate fecha) {
		Pasaje pasaje = new Pasaje(asientos,pasajero,vuelos,fecha);
		this.pasajes.add(pasaje);
		return pasaje;

	}
	
	public Pasaje modificarPasaje(Pasaje pasaje) {
		return pasaje;
	}
	
	public void cancelarPasaje(Pasaje pasaje) {
		this.pasajes.remove(pasaje);
	}
	
	public double ocupacionVueloEnPeriodoDeTiempo (Vuelo vuelo, LocalDate inicio, LocalDate fin) {
		
		double cantidadAsientosOcupados= this.pasajes.stream()
				.filter(pasaje -> pasaje.estaEntreFechas(inicio, fin))
				.filter(pasaje -> pasaje.poseeVuelo(vuelo)).count();
		return cantidadAsientosOcupados/vuelo.getCantidadAsientosVuelo();
		
	}
}
