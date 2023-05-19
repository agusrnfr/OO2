package ar.edu.unlp.info.oo2.ejercicio2_5_EnvioDePedidos;

import java.text.MessageFormat;

public class Supermercado {
	public void notificarPedido(long nroPedido, Cliente cliente) {
		String notificacion = MessageFormat.format(
				"Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}",
				new Object[] { nroPedido, cliente.getDireccionFormateada() });

		// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
		System.out.println(notificacion);
	}
}