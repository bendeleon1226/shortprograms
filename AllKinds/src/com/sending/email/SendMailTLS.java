package com.sending.email;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {

	public static void main(String[] args) {


		final String username = "test.email.july.2016@gmail.com";
		final String password = "TestAccount";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,new GMailAuthenticator(username, password));

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("test.email.july.2016@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("bendeleonjr@hotmail.com"));
			message.setSubject("Stocks Updates");
			String tableStart = "<table border = '1'>";
			String tablerow = "<tr><td>Stock Symbol</td><td>Total Value</td><td>Low</td><td>High</td><td>Buy Price</td><td>Sell Price</td><td>How Close</td></tr>";
			String tableEnd = "</table>";
			message.setContent(tableStart+tablerow+tableEnd, "text/html" );

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}
