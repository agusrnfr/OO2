package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() throws Exception{
		biblioteca = new Biblioteca();
		biblioteca.setExporter(new JSONSimpleAdapter()); // 		biblioteca.setExporter(new JacksonAdapter());
	}
	
	@Test
	public void testExportarSocios() throws ParseException{
		JSONParser parseo = new JSONParser();
		String textoSalida = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		
		assertEquals(parseo.parse("[]"),parseo.parse(this.biblioteca.exportarSocios())); //VACIO
		
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
		assertEquals(parseo.parse(textoSalida),parseo.parse(this.biblioteca.exportarSocios()));
		
	}
}
