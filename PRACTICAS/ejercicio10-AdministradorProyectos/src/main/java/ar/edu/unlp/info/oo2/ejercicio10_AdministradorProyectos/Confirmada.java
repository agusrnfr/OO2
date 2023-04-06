package ar.edu.unlp.info.oo2.ejercicio10_AdministradorProyectos;

public class Confirmada extends Etapa{

	public Confirmada(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
	}

	@Override
	public boolean modificarMargenDeGanancias(double margen) {
		return false;	
	}

}
