package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter implements VoorheesExporter {
	
	private Object crearJSONSocio (Socio socio){
		
		JSONObject objectJSON = new JSONObject();		
		objectJSON.put("nombre",socio.getNombre());
		objectJSON.put("email",socio.getEmail());
		objectJSON.put("legajo",socio.getLegajo());
		return objectJSON;
		
	}

	@Override
	public String exportar(List<Socio> socios) {
		JSONArray arrayJSON = new JSONArray();
		socios.stream().forEach(socio -> arrayJSON.add(this.crearJSONSocio(socio)));
		return arrayJSON.toJSONString();
	}

}
