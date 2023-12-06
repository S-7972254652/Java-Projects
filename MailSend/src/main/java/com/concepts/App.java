package com.concepts;

import com.concepts.email.GEmailSender;

public class App {
public static void main(String[] args) {
	
	GEmailSender gEmailSender=new GEmailSender();
	String to="sahilgaikwad669@gmail.com";
	String from="sagarswani79@gmail.com";
	String subject="Sending Email Using Gmail";
	String text="This Email is Send By using Java";
	boolean b=gEmailSender.sendEmail(to,from,subject,text);
	if(b) {
		System.out.println("Email Sent Successfully");
		
	}else {
		System.out.println("Something Went Wrong..");
	}
}
}
