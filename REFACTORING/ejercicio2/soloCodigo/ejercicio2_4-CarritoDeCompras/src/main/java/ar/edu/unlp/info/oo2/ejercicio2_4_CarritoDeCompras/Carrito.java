package ar.edu.unlp.info.oo2.ejercicio2_4_CarritoDeCompras;

import java.util.List;

public class Carrito {
	private List<ItemCarrito> items;

	public double total() {
		return this.items.stream().mapToDouble(item -> item.calcularTotal()).sum();
	}

}
