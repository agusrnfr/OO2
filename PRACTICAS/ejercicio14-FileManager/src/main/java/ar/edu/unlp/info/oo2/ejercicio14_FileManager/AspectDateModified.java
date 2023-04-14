package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class AspectDateModified extends Aspect {

	public AspectDateModified(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getDateModified();
	}
}
