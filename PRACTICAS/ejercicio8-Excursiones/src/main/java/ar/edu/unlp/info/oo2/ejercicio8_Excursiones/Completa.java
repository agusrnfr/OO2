package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

public class Completa extends Estado {

	public Completa(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().getEnEspera().add(unUsuario);
	}

	@Override
	public String obtenerInformacion() {
		return "";
	}

}
