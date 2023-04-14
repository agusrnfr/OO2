package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class AspectPermissions extends Aspect {

	public AspectPermissions(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermissions();
	}
}
