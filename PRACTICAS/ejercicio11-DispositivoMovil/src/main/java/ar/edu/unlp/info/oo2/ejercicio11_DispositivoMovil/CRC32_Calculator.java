package ar.edu.unlp.info.oo2.ejercicio11_DispositivoMovil;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{
	private CRC32 crc;
	
	public CRC32_Calculator () {
		crc = new CRC32();
	}
	
	public long crcFor(String datos) {
		crc.update(datos.getBytes());
		return crc.getValue();
	}
}
