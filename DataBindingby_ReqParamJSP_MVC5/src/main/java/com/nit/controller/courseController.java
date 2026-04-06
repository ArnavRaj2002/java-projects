package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class courseController {

	@RequestMapping("/display1")
	public String requestParam(Map<String, Object> map,
			@RequestParam("sno") Integer no,
			@RequestParam("sname") String name)
	{
		System.out.println(no+" :: "+name);
		map.put("NAME", name);
		map.put("NO",no);
		//model.addAttribute("NAME", name);
		return "display";
	}
}
