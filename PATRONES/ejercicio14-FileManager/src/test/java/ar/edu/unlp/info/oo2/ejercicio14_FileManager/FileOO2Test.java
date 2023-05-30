package ar.edu.unlp.info.oo2.ejercicio14_FileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {
	private FileOO2 file;
	private FileOO2 name;
	private FileOO2 extension;
	private FileOO2 size;
	private FileOO2 dateCreated;
	private FileOO2 dateModified;
	private FileOO2 permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new File ("The Next Best American Record", ".mp3", 10.5, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), "rwxr-xr-x");
		
	}

	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new AspectName(file);  
		this.extension = new AspectExtension(name);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		//name - extension - date created
		this.name = new AspectName(file);  
		this.extension = new AspectExtension(name);
		this.dateCreated = new AspectDateCreated(extension);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3 2019-08-30",this.dateCreated.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		//permissions - name - extension - size
		this.permissions = new AspectPermissions(file);  
		this.name = new AspectName (permissions);
		this.extension = new AspectExtension(name);
		this.size = new AspectSize(extension);
		
		assertEquals("Datos del archivo:\n rwxr-xr-x The Next Best American Record .mp3 10.5 MB",this.size.prettyPrint());
	}

}
