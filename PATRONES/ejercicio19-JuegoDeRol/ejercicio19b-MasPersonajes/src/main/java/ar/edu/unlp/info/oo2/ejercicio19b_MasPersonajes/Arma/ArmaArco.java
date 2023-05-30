package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma;

public class ArmaArco implements Arma{

	@Override
	public String getTipo() {
		return "Arco";
	}

	@Override
	public int calcularDanio(String tipoArmadura) {
		if (tipoArmadura.equals("Armadura de cuero")) {
			return 5;}
		if (tipoArmadura.equals("Armadura de hierro")) {
			return 3;}
		else return 2;
	}

}
