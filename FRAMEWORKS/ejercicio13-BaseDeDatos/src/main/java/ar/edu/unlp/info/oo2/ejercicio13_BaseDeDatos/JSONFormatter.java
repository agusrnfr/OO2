package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import java.util.logging.*;
import org.json.simple.JSONObject;

public class JSONFormatter extends Formatter{

	@SuppressWarnings("unchecked")
	@Override
	public String format(LogRecord record) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", record.getMessage());
		jsonObject.put("level", record.getLevel());
		return jsonObject.toString();
	}

}
