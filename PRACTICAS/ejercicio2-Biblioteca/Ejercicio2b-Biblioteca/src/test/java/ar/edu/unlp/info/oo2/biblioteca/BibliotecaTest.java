package ar.edu.unlp.info.oo2.biblioteca;

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
	private Socio arya;
	private Socio tyron;
	
	@BeforeEach
	public void setUp() throws Exception{
	
		biblioteca = new Biblioteca();
		arya=new Socio("Arya Stark", "needle@stark.com", "5234-5");
		tyron=new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
		biblioteca.agregarSocio(arya);
		biblioteca.agregarSocio(tyron);
	}
	
	@Test
	public void testExportarSocios() throws ParseException {
		
		Object obj = new JSONParser().parse(biblioteca.exportarSocios());
		JSONArray arrayJSON = (JSONArray) obj;
		
		List<Socio> arrayComparador = new ArrayList<Socio>();
		arrayComparador.add(arya);
		arrayComparador.add(tyron);
		
		
		for (int i=0;i<arrayJSON.size();i++) {
			JSONObject objectJSON= (JSONObject) arrayJSON.get(i);
			assertTrue(arrayComparador.get(i).getNombre().equals(objectJSON.get("nombre")));
			assertTrue(arrayComparador.get(i).getEmail().equals(objectJSON.get("email")));
			assertTrue(arrayComparador.get(i).getLegajo().equals(objectJSON.get("legajo")));
			
		}
	}
}
