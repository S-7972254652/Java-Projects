package com.concepts.email;

import java.net.Authenticator;
import java.util.Properties;

import com.mysql.cj.protocol.Message;

import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.internet.MimeMessage;

public class GEmailSender {
	public boolean sendEmail(String to, String from, String subject, String text) {
		boolean flag = false;
//logic to send email
//smtp properties
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		
		String username="sahilgaikwad669";
		String password="";
		
		//Session
		Session session=Session.getInstance(properties,new jakarta.mail.Authenticator() {
		@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
				
			}
		
		});
		try {
			
			Message message=new MimeMessage(session);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}
}
