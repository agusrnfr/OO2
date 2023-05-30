package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

import java.time.LocalDate;

public class File implements FileOO2 {
	private String name;
	private String extension;
	private double size;
	private LocalDate dateCreated;
	private LocalDate dateModified;
	private String permissions;
	
	public File(String name, String extension, double size, LocalDate dateCreated, LocalDate dateModified,
			String permissions) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.permissions = permissions;
	}
	@Override
	public String prettyPrint() {
		return "Datos del archivo:\n";
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getExtension() {
		return this.extension;
	}
	@Override
	public String getSize() {
		return Double.toString(this.size);
	}
	@Override
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	@Override
	public String getDateModified() {
		return this.dateModified.toString();
	}
	@Override
	public String getPermissions() {
		return this.permissions;
	}
	
	

}
