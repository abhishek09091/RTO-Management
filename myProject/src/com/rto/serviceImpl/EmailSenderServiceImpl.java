package com.rto.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.rto.services.EmailSenderService;
@Service
public class EmailSenderServiceImpl implements EmailSenderService {
	@Autowired
    private JavaMailSender mail;	
	public void sendEmail(String userEmail,String userPassword)
	{
	System.out.println("in email send method");
/*	String addr=req.getParameter("email");
	String sub=req.getParameter("subject");
	String msg=req.getParameter("message");
	System.out.println("To: " + addr);
    System.out.println("Subject: " + sub);
    System.out.println("Message: " + msg);*/
     
    // creates a simple e-mail object
    SimpleMailMessage email = new SimpleMailMessage();
    email.setTo(userEmail);
    email.setSubject("Registration Successful");
    email.setText("hello,"+
       "Thank You For Registering With Us."+
	   " your password is: "+userPassword);
     System.out.println("mail object is"+mail);
    // sends the e-mail
    mail.send(email);
     
	}
    // forwards to the view named "Result"

}
