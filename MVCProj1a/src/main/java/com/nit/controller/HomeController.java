package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

@RequestMapping("/byehome")     //handler method having request path
public String showHomeController1()
{
return "forward:Welcomehome";//LVN
	 
}
@RequestMapping("/Welcomehome")     //handler method having request path
	public String showHomeController()
	{
	
	return "welcome";//LVN
		//return "Welcome Here !!";
	}
 
}
