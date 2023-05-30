package ar.edu.unlp.info.oo2.ejercicio8_Excursiones;

public class Definitiva extends Estado {

	public Definitiva(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().getInscriptos().add(unUsuario);
		if (this.getExcursion().alcanzoMaximo())
			this.getExcursion().setEstado(new Completa(this.getExcursion()));
	}

	@Override
	public String obtenerInformacion() {
		return "\nActualmente faltan " + (this.getExcursion().getCupoMaximo() - this.getExcursion().getInscriptos().size())
				+ " personas para alcanzar el cupo maximo"
				+ ".\nA continuacion se listaran los mails de los usuarios inscriptos: " + this.getExcursion().getMailsInscriptos();
	}

}
