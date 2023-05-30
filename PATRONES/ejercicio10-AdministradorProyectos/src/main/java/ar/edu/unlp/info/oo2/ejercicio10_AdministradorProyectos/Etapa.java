package ar.edu.unlp.info.oo2.ejercicio10_AdministradorProyectos;

public abstract class Etapa {
	private Proyecto proyecto;
	
	public Etapa(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public Proyecto getProyecto() {
		return proyecto;
	}

	public abstract void aprobarEtapa();
	public abstract boolean modificarMargenDeGanancias(double margen);
}
