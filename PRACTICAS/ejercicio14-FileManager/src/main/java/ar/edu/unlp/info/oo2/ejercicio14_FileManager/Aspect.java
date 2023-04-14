package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

public class Aspect implements FileOO2{
	private FileOO2 component;

	public Aspect(FileOO2 component) {
		this.component = component;
	}

	@Override
	public String prettyPrint() {
		return this.component.prettyPrint() + " ";
	}

	@Override
	public String getName() {
		return this.component.getName();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public String getSize() {
		return this.component.getSize();
	}

	@Override
	public String getDateCreated() {
		return this.component.getDateCreated();
	}

	@Override
	public String getDateModified() {
		return this.component.getDateModified();
	}

	@Override
	public String getPermissions() {
		return this.component.getPermissions();
	}

}
