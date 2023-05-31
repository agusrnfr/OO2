package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class FilterHandler extends Handler {
	private Handler handler;
	private List<String> wordsToHide;
	
	public FilterHandler (Handler handler, List<String> wordsToHide) {
		this.handler = handler;
		this.wordsToHide = wordsToHide;
		
	}
	
	public FilterHandler (Handler handler) {
		this.handler = handler;
		this.wordsToHide = new ArrayList<String>();
		
	}
	
	public void addWord (String word) {
		this.wordsToHide.add(word);
	}
	
	private String censorWords(String msg) {
		for (String word: wordsToHide) {
			if (msg.contains(word)) {
				msg = msg.replaceAll(word, "***");
			}
		}
		return msg;
	}
	
	@Override
	public void publish(LogRecord record) {
		record.setMessage(censorWords(record.getMessage()));
		this.handler.publish(record);
	}

	@Override
	public void flush() {
		this.handler.flush();
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
	}

}
