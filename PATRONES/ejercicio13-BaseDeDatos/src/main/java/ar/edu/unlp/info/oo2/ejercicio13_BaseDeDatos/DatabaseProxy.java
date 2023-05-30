package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import java.util.Collection;
import java.util.List;

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
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (!this.isLog) {
			throw new RuntimeException("access denied"); 
		}
		return this.database.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (!this.isLog) {
			throw new RuntimeException("access denied"); 
		}
		return this.database.insertNewRow(rowData);
	}
	
	

}
