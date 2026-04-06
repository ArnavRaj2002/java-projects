package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Student;

@Controller
public class StudentController {
	@RequestMapping("/dispaly1")
	public String displayPage() {

		return "welcome";

	}

	@RequestMapping("/dispaly2")
	public String registerForm(@ModelAttribute("stu") Student stud) {
		// return "registerForm";
		return "registerFormLib";
	}

	@RequestMapping("/dispaly3") // post
	public String dispalyForm(@ModelAttribute("stu") Student stud) {
		System.out.println("o/p::" + stud);
		return "dispalyForm";

	}

	/*
	 * Student st = new Student(); // Step 1: create object
	 * st.setId(request.getParameter("id")); //internally
	 * st.setName(request.getParameter("name")); st.setAge(...); st.setCountry(...);
	 * model.put("stud", st); // Step 2: add to model with name "stud" 
	 * // put into model with name "stud"
	 */
}
