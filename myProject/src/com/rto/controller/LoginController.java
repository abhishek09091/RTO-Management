package com.rto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

@RequestMapping(value="/login")
public String loginUser()
{
	System.out.println("in login user");
	return null;
}
	
}
