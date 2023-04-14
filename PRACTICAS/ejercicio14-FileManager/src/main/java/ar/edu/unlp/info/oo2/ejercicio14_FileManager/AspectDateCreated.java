package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class AspectDateCreated extends Aspect{

	public AspectDateCreated(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getDateCreated();
	}
}
