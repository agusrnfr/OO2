package ar.edu.unlp.info.oo2.ejercicio13_BaseDeDatos;

import java.util.Properties;
import java.util.logging.*;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailHandler extends Handler{
	
	public void sendMail(LogRecord record) throws RuntimeException {
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// credenciales
			String username = "04392b2aebebcc"; // Completar con su username de mailtrap
			String password = "52f365ba020f83"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");				 
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Log level: " + record.getLevel().toString());
		    message.setText("Message: "+ record.getMessage());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
	
	@Override
	public void publish(LogRecord record) {
		try {
			this.sendMail(record);
		}
		catch (RuntimeException e) {
			System.out.println(e);
		}
	}

	@Override
	public void flush() {
	    // No se requiere ninguna acción para flush en este caso
		
	}

	@Override
	public void close() throws SecurityException {
	    // No se requiere ninguna acción para close en este caso
		
	}
}
