package ar.edu.unlp.info.oo2.ejercicio11_DispositivoMovil;

public class Dispositivo {
	private Connection connection;
	private Display display;
	private Ringer ringer;
	private CRC_Calculator crcCalculator;
	
	public Dispositivo() {
		this.connection = new fourGAdapter();
		this.crcCalculator = new CRC16_Calculator();
		this.display = new Display();
		this.ringer = new Ringer();
	}

	public String send (String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data,crc);
	}
	
	public String configurarCRC (CRC_Calculator calculator) {
		this.crcCalculator = calculator;
		return "crc calculator changed";
	}
	
	public String conectarCon (Connection connection) {
		this.connection = connection;
		this.display.showBanner(connection.pict());
		this.ringer.ring();
		return "connection changed";
	}

}
