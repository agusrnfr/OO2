package ar.edu.unlp.info.oo2.ejercicio19_JuegoDeRol.Arma;

public class ArmaEspada implements Arma {

	@Override
	public String getTipo() {
		return "Espada";
	}
	
	@Override
	public int calcularDanio(String tipoArmadura) {
		if (tipoArmadura.equals("Armadura de cuero")) {
			return 8;}
		if (tipoArmadura.equals("Armadura de hierro")) {
			return 5;}
		else return 3;
	}

}
