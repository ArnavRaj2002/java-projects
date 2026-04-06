package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Employee;

@Controller
public class EmpController {
	@RequestMapping("/showData1")
	public String addData1(Map<String, Object> map) {
		Employee emp = new Employee();
		emp.setAge(20);
		emp.setName("Arnav");
		emp.setCountry("India");
		map.put("empInfo", emp);
		return "show_report1";

	}

	@RequestMapping("/showData2")
	public String addData2(Map<String, Object> map) {
		map.put("userName", "Arnav@Nit");
		map.put("courseTime", 7);
		return "show_report2";

	}

	@RequestMapping("/showData3")
	public String addData3(Map<String, Object> map) {
		map.put("favColors", new String[] { "red", "brown", "yellow" });
		map.put("listOfCourses", List.of("java", ".Net", "React"));
		return "show_report3";

	}

	@RequestMapping("/showData4")
	public String addData4(Map<String, Object> map) {
		List<String> listOfCity = List.of("hyd", "sec", "blr", "delhi");
		map.put("cityList", listOfCity);
		return "show_report4";
	}
}
