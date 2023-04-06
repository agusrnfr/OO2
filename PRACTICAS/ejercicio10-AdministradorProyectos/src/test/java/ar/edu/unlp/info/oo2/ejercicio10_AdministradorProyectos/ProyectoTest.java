package ar.edu.unlp.info.oo2.ejercicio10_AdministradorProyectos;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto proyecto;
	private Proyecto proyectoPrecio0;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.proyecto = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,1500);
		this.proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,0);
		this.proyecto.aprobarEtapa();
	}

	@Test
	public void testAprobarEtapa() {
	    assertTrue(this.proyecto.getEtapa() instanceof EnEvaluacion);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEtapa() instanceof Confirmada);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEtapa() instanceof Confirmada);
		
		Exception exceptionPrecio0 = assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobarEtapa();});
	    assertEquals("No se puede pasar a la etapa 'En Evaluacion' ya que el proyecto posee un precio de $0",exceptionPrecio0.getMessage());
	}
	
	@Test
	public void testCostoYPrecioDelProyecto() {
		assertEquals(45000,this.proyecto.costoProyecto());
		assertEquals(48150,this.proyecto.precioProyecto());
		
		assertEquals(0,this.proyectoPrecio0.costoProyecto());
		assertEquals(0,this.proyectoPrecio0.precioProyecto());
	}
	
	@Test
	public void testModificarMargenDeGanancias() {		
		this.proyecto.modificarMargenDeGanancias(0.10);
		assertEquals(48150,this.proyecto.precioProyecto());
		this.proyecto.modificarMargenDeGanancias(0.16);
		assertEquals(48150,this.proyecto.precioProyecto());
		this.proyecto.modificarMargenDeGanancias(0.11);
		assertEquals(49950,this.proyecto.precioProyecto());
		this.proyecto.modificarMargenDeGanancias(0.15);
		assertEquals(51750,this.proyecto.precioProyecto());
		
		this.proyecto.aprobarEtapa();
		this.proyecto.modificarMargenDeGanancias(0.10);
		assertEquals(51750,this.proyecto.precioProyecto());
	}
	
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelarProyecto();
		assertEquals("salir con amigos (Cancelado)",this.proyecto.getObjetivo());
		this.proyecto.cancelarProyecto();
		assertEquals("salir con amigos (Cancelado)",this.proyecto.getObjetivo());
	}

}
