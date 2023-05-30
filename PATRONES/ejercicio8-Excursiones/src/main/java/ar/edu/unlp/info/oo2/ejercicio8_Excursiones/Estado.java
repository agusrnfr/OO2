package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

public abstract class Estado {
	private Excursion excursion;

	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}

	public Excursion getExcursion() {
		return this.excursion;
	}
	
	public abstract void inscribir (Usuario unUsuario);
	public abstract String obtenerInformacion();
}
