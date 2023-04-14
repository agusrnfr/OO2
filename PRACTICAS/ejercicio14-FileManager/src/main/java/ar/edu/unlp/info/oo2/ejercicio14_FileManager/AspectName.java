package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class AspectName extends Aspect{

	public AspectName(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getName();
	}
}
