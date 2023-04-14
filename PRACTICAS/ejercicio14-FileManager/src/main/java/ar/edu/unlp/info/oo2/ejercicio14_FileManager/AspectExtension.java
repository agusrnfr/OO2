package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class AspectExtension extends Aspect {

	public AspectExtension(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}
}
