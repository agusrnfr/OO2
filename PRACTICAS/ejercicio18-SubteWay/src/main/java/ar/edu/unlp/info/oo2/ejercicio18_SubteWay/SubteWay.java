package ar.edu.unlp.info.oo2.ejercicio18_SubteWay;

public class SubteWay {
	private Constructor constructor;
	
	public SubteWay(Constructor constructor) {
		this.constructor = constructor;	
	}
	
	public void hacerSandwichClasico() {
		this.constructor.agregarPan(100);
		this.constructor.agregarAderezo(20);
		this.constructor.agregarPrincipal(300);
		this.constructor.agregarAdicional(80);
	}
	
	public void hacerSandwichVegetariano() {
		this.constructor.agregarPan(120);
		this.constructor.agregarPrincipal(200);
		this.constructor.agregarAdicional(100);
		
	}
	
	public void hacerSandwichVegano() {
		this.constructor.agregarPan(100);
		this.constructor.agregarAderezo(20);
		this.constructor.agregarPrincipal(500);
		
	}
	
	public void hacerSandwichSinTACC() {
		this.constructor.agregarPan(150);
		this.constructor.agregarAderezo(18);
		this.constructor.agregarPrincipal(250);
		this.constructor.agregarAdicional(200);
		
	}

}
