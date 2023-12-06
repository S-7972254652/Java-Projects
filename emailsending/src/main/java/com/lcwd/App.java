package com.lcwd;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "preparing to send message ..." );
        
        String message="Hello, Dear This is message for security check!";
        String subject="Runstore : Confirmation";
        String to="sagar.wani@ges-coengg.org";
        String from="sagarswani79@gmail.com";
        
        sendEmail(message,subject,to,from);
    }
//this is responsible to send email..
	private static void sendEmail(String message, String subject, String to, String from) {
		
		//Variable For Gmail Host..
		String host="smtp.gmail.com";
		
		//get the system propeties
		Properties properties=System.getProperties();
		System.out.println("PROPERTIES"+properties);
		
		//Setting important information to properties object
		
		//host set
		
		properties.put("mail.smpt.host", host);
		properties.put("mail.smpt.port", "465");
		properties.put("mail.smpt.ssl.enable", "true");
		properties.put("mail.smpt.auth", "true");
		
//		Step1:to get the session object
		Session.getInstance(properties,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("sagarswani79@gmail.com", "7972254652");
				
				
			}
		
		});
		session.setDebug();
//		Step 2:Compose The Message
		
		
		
		
	}
}
