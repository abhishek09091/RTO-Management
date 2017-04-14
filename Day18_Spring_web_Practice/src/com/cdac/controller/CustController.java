package com.cdac.controller;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cdac.pojos.Customer;
import com.cdac.services.CustomerService;

@Controller
@RequestMapping(value="/cust")
public class CustController {

	@Autowired
	CustomerService cust;
	
	@RequestMapping(value="/login")
	public String showLoginForm(Customer c)
	{
	System.out.println("in show login method");
	return "login";	
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String processForm(@Valid Customer c,BindingResult res,ModelMap map,RedirectAttributes flash,HttpSession hs)
	{
		System.out.println("in proces form method");
		System.out.println("customer in the processForm "+c+" "+"map is"+map+"res is"+res);
		Customer c1=cust.validateCustomer(c.getEmail(),c.getPass());
		
		if(res.hasErrors())
	{
			System.out.println("in haserror method");
			return "login";
	}
		if(c1==null)
		{
			System.out.println("in c1==null branch");
			map.addAttribute("msg","invalid username or password");
			return "login";
		}
		else
		{
			System.out.println("in else branch");
			flash.addFlashAttribute("cust", c1);
		return "redirect:/details";
		}
	}
	
	@RequestMapping("/register")
	public String showRegisterForm(Customer c)
	{
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	//@RequestMapping(value="/register")
	public String processRegister(@Valid Customer c,BindingResult res,RedirectAttributes flash,ModelMap map,HttpSession hs)
	{
		if(res.hasErrors())
		{
				System.out.println("in haserror method");
				return "register";
		}
		else
		{
		System.out.println("in process register method cust is"+c+"map is"+map);
		int id=cust.registerCustomer(c);
		System.out.println("id is"+id);
		hs.setAttribute("cust",c);
		flash.addFlashAttribute("custid",Integer.valueOf(id));
		System.out.println("before return"+" "+flash);
		return "redirect:/rdetails";
		}
	}
	
	
}
