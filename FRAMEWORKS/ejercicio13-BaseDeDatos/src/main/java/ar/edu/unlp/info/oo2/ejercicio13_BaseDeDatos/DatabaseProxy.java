package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseAccess database;
	private boolean isLog;
	
	public DatabaseProxy (DatabaseAccess database) {
		this.database = database;
		this.isLog = false; //No haria falta, ya se inicializa en false
	}

	public void logIn () {
		this.isLog = true;
	}
	
	public void closeSession() {
		this.isLog = false;
	}
	
	public void checkLog() throws RuntimeException {
		if (!this.isLog) {
			Logger.getLogger("bd").log(Level.SEVERE, "access denied");
			throw new RuntimeException("access denied"); 
		}
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		this.checkLog();
		Logger.getLogger("bd").log(Level.INFO, "search db");
		return this.database.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		this.checkLog();
		Logger.getLogger("bd").log(Level.WARNING, "insert db");
		return this.database.insertNewRow(rowData);
	}

	
	

}
