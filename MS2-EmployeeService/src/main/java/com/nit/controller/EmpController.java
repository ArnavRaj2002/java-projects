package com.nit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RefreshScope
@RestController
@RequestMapping("/emp")
public class EmpController {
	@Value("${dbUser}")
	//@Value("${dbuser}") works why??
private String userName;
	@Value("${Password}")
	//@Value("${password}")                    //gpt say it is case-sensitive but here works??
private String password;
@GetMapping("/display")
public String getDetails()
{
	return "My User Name is:= "+userName+"  [::]  Password is:= "+password;
}
}
