package ar.edu.unlp.info.oo2.ejercicio11_DispositivoMovil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dispositivo;

	@BeforeEach
	public void setUp() throws Exception {
		this.dispositivo = new Dispositivo();
		
	}

	@Test
	public void testSend() {
		assertEquals("transmitting data with 4G Connection",this.dispositivo.send("Datos"));
	}
	
	@Test
	public void testConectarCon() {
		assertEquals("connection changed", this.dispositivo.conectarCon(new WifiConn()));
		assertEquals("connection changed", this.dispositivo.conectarCon(new fourGAdapter()));
		
	}
	
	@Test
	public void testConfigurarCRC() {
		assertEquals("crc calculator changed",this.dispositivo.configurarCRC(new CRC32_Calculator()));
		assertEquals("crc calculator changed",this.dispositivo.configurarCRC(new CRC16_Calculator()));
	}

}
