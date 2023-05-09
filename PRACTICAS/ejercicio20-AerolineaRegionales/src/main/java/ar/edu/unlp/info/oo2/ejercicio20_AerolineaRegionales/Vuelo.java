package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegionales;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
	private PilatusPC12 avion;
	private String zonaSalida;
	private String zonaDestino;
	private LocalTime salida;
	private LocalTime destino;
	private double costoBase;
	private List<DayOfWeek> dias;
	
	public Vuelo(PilatusPC12 avion,String zonaSalida, String zonaDestino, LocalTime salida, LocalTime destino, double costoBase) {
		this.avion = avion;
		this.zonaSalida = zonaSalida;
		this.zonaDestino = zonaDestino;
		this.salida = salida;
		this.destino = destino;
		this.costoBase = costoBase;
		this.dias = new ArrayList<DayOfWeek>();
		this.dias.add(DayOfWeek.MONDAY);
		this.dias.add(DayOfWeek.TUESDAY);
		this.dias.add(DayOfWeek.WEDNESDAY);
		this.dias.add(DayOfWeek.THURSDAY);
		this.dias.add(DayOfWeek.FRIDAY);
		this.dias.add(DayOfWeek.SATURDAY);
		this.dias.add(DayOfWeek.SUNDAY);
	}

	public String getZonaSalida() {
		return zonaSalida;
	}

	public String getZonaDestino() {
		return zonaDestino;
	}

	public LocalTime getSalida() {
		return salida;
	}

	public LocalTime getDestino() {
		return destino;
	}

	public double getCostoBase() {
		return costoBase;
	}

	public List<DayOfWeek> getDias() {
		return dias;
	}
	
	public int getCantidadAsientosVuelo() {
		return this.avion.getCantPasajeros();
	}
	
	public boolean poseeAvion(PilatusPC12 avion) {
		return this.avion.equals(avion);
	}
	
	public int horasDeViaje() {
		return (int) Duration.between(salida, destino).getSeconds() / 3600;
		
	}
}
