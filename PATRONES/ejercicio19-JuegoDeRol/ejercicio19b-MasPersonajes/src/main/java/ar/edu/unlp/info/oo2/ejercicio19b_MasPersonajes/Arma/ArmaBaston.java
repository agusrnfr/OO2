package ar.edu.unlp.info.oo2.ejercicio19b_MasPersonajes.Arma;

public class ArmaBaston implements Arma {

	@Override
	public String getTipo() {
		return "Baston";
	}
	
	@Override
	public int calcularDanio(String tipoArmadura) {
		if (tipoArmadura.equals("Armadura de cuero")) {
			return 2;}
		if (tipoArmadura.equals("Armadura de hierro")) {
			return 1;}
		else return 1;
	}
	

}
