package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma;

public class ArmaMartillo implements Arma{

	@Override
	public String getTipo() {
		return "Martillo";
	}

	@Override
	public int calcularDanio(String tipoArmadura) {
		if (tipoArmadura.equals("Armadura de cuero")) {
			return 10;}
		if (tipoArmadura.equals("Armadura de hierro")) {
			return 7;}
		else return 5;
	}

}
