package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

public class Provisoria extends Estado {
	
	public Provisoria(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().getInscriptos().add(unUsuario);
		if (this.getExcursion().alcanzoMinimo())
			this.getExcursion().setEstado(new Definitiva(this.getExcursion()));
	}

	@Override
	public String obtenerInformacion() {
		return "\nActualmente faltan " + (this.getExcursion().getCupoMinimo() - this.getExcursion().getInscriptos().size())
				+ " personas para alcanzar el cupo minimo.";
	};
}
