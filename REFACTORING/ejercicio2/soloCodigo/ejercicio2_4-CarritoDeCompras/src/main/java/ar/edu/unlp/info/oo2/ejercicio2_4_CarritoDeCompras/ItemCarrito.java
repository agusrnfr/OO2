package ar.edu.unlp.info.oo2.ejercicio2_4_CarritoDeCompras;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public double calcularTotal() {
    	return this.producto.getPrecio() * this.cantidad;
    }
}

