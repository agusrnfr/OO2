package ar.edu.unlp.info.oo2.ejercicio10_AdministradorProyectos;

public class EnEvaluacion extends Etapa{

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		this.getProyecto().setEtapa(new Confirmada(this.getProyecto()));
	}

	@Override
	public boolean modificarMargenDeGanancias(double margen) {
		return (margen >= 0.11 && margen <= 0.15);
	}

}
