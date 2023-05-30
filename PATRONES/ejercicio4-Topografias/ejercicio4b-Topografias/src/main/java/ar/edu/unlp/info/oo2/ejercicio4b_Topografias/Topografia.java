package ar.edu.unlp.info.oo2.ejercicio4b_Topografias;

public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	
	public double getProporcionTierra() {
		return 1.00 - this.getProporcionAgua();
	}
	
	public Object getTopografia() { // RETORNO OBJETO PARA PODER COMPARAR UNA TOPOGRAFIA ATOMICA CON UNA COMPUESTA
		return this;
	}
	
	public  boolean isEquals(Topografia topografia) {
		return (this.getProporcionAgua() == topografia.getProporcionAgua());
	}
	
	@Override
	public  boolean equals(Object objeto) {
		return this.isEquals((Topografia)objeto); // DEBO REDEFINIRLA PARA QUE LA COMPARACION DE TOPOGRAFIA MIXTA SEA EN CUANDO A PROPORCION
												 // SI NO LO REDEFINO ENTONCES ME COMPARA SI ES EL MISMO OBJETO (misma referencia a memoria) 
	}
}
