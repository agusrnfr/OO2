package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class SubteWay {
	private Constructor constructor;
	
	public SubteWay(Constructor constructor) {
		this.constructor = constructor;	
	}

	public void hacerSandwich() {
		this.constructor.reset();
		this.constructor.agregarPan();
		this.constructor.agregarAderezo();
		this.constructor.agregarPrincipal();
		this.constructor.agregarAdicional();
	}
	
	public void cambiarConstructor(Constructor constructor) {
		this.constructor = constructor;	
	}

}
