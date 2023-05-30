package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import java.util.logging.*;

public class ShoutingSimpleFormatter extends SimpleFormatter{
	
	public String format (LogRecord record) {
		return super.format(record).toUpperCase();
	}

}
