package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
    private DatabaseAccess database;
	private DatabaseProxy proxy;
	private static Logger logger = Logger.getLogger("bd");
	
	   @BeforeAll
	    public static void configLogger() {
	    	LogManager.getLogManager().reset();
    	    logger.setLevel(Level.INFO);
    	    ConsoleHandler handlerConsola = new ConsoleHandler();
    	    handlerConsola.setFormatter(new ShoutingSimpleFormatter());
    	    logger.addHandler(handlerConsola);
			
			try {
				Handler fileHandler = new FileHandler("resources/logs/myLogs.json");
				fileHandler.setFormatter(new JSONFormatter());
				Logger.getLogger("bd").addHandler(fileHandler);
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	@BeforeEach
	public void setUp() throws Exception {
		this.database = new DatabaseRealAccess();
		this.proxy = new DatabaseProxy(database);
	}

	@Test
	public void testGetSearchResults() {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=1");});
		assertEquals("access denied",exceptionPending.getMessage());

		this.proxy.logIn();
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
        
        this.proxy.closeSession();
        Exception exceptionPending2 = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=10");});
		assertEquals("access denied",exceptionPending2.getMessage());
	}
	
    @Test
    public void testInsertNewRow() {
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("access denied",exceptionPending.getMessage());
		
		this.proxy.logIn();
		assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
        
        this.proxy.closeSession();
        Exception exceptionPending2 = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("access denied",exceptionPending2.getMessage());
       
    }

}
