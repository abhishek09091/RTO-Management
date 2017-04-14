package com.rto.controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rto.pojos.*;
import com.rto.services.EmailSenderService;
import com.rto.services.RegisterService;

@Controller
@RequestMapping(value="/cust")
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@Autowired
	private EmailSenderService emailSender;
	@RequestMapping(value="/completeRegisteration",method=RequestMethod.GET)
	public String getForm(UserInfo u){
		System.out.println("in form first"+u);
		return "registration";
	}
	@RequestMapping(value="/completeRegisteration", method=RequestMethod.POST)
	public String getFormDetails(UserInfo u,BindingResult br,RedirectAttributes attr,Model map,HttpServletRequest req) throws Exception{
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=sdf1.parse(req.getParameter("dateOfBirth"));
		
		String mesg = "Registration Successfull. Please Check your Email for Lodin and Password";
		System.out.println("in getFormDetails user info is"+u);
		String fname=req.getParameter("firstName");
		String lname=req.getParameter("lastName");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		System.out.println("fname,lname,email,gender"+fname+" "+lname+" "+email+" "+gender+" "+dob);
		u.setFirstName(fname);
		u.setLastName(lname);
		u.setEmail(email);
		u.setDateOfBirth(dob);
		u.setGender(gender);
		String id=service.saveDetails(u);
		if(id == null){
			mesg = "Email is repeated please provide proper user E-mail";
			map.addAttribute("mesg", mesg);
			return "registration";
		}
		System.out.println("user deatils after registration is"+u);
		//Apply Event 
		//set Password
		//Apply mail
		//u = user;
		emailSender.sendEmail(u.getEmail(), u.getUser().getPassword());
		System.out.println("in getFormDetails...2");
		attr.addFlashAttribute("mesg", mesg);
		return "redirect:/";
			
	}
	/*@RequestMapping(value="/login")
	public String getLoginForm(User login){
		System.out.println("in Lodin first"+login);
		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String checkLogin(User login){
		System.out.println("in Lodin second"+login);
		UserInfo user = service.vlaidateUser(login);
		return "info";
	}*/
}
