package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class AspectSize extends Aspect {

	public AspectSize(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getSize() + " MB";
	}
}
