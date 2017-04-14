package com.cdac.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/email")
public class EmailController {

	  @Autowired
	    private JavaMailSender mail;	
	
@RequestMapping(value="/send")
String showForm()
{
	System.out.println("in email form show method");
	
	return "emailform";
}

@RequestMapping(value="/send",method=RequestMethod.POST)
String sendEmail(HttpServletRequest req)
{
	System.out.println("in email send method");
	String addr=req.getParameter("email");
	String sub=req.getParameter("subject");
	String msg=req.getParameter("message");
	System.out.println("To: " + addr);
    System.out.println("Subject: " + sub);
    System.out.println("Message: " + msg);
     
    // creates a simple e-mail object
    SimpleMailMessage email = new SimpleMailMessage();
    email.setTo(addr);
    email.setSubject(sub);
    email.setText(msg);
     
    // sends the e-mail
    mail.send(email);
     
    // forwards to the view named "Result"
	return "emailsent";
}
}
