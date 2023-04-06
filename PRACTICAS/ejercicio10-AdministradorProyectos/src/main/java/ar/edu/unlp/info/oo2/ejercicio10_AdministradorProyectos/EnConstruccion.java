package ar.edu.unlp.info.oo2.ejercicio10_AdministradorProyectos;

public class EnConstruccion extends Etapa{

	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		if (this.getProyecto().precioProyecto() > 0) {
			this.getProyecto().setEtapa(new EnEvaluacion(this.getProyecto()));
		}
		else throw new RuntimeException("No se puede pasar a la etapa 'En Evaluacion' ya que el proyecto posee un precio de $0");
	}

	@Override
	public boolean modificarMargenDeGanancias(double margen) {
		return (margen >= 0.08 && margen <= 0.1);
		
	}

}
