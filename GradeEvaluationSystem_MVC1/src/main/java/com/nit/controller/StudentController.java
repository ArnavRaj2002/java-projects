package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.modal.Student;
@Controller
public class StudentController {
	
	@RequestMapping("/studentDetails")
	public String studentDetails(Model model)
	{
		Student s = new Student();
		s.setRollNo(101);
		model.addAttribute(s);
		return "admission-form";
		
	}
	@RequestMapping("/studentGradeCalculator")
	public String GradeCalculator(
			@RequestParam("name") String name,
			@RequestParam("rollNo") Integer rollNo,
			@RequestParam("marks1") Integer marks1,
			@RequestParam("marks2") Integer marks2,
			@RequestParam("marks3") Integer marks3,
			Map<String,Object> map)
	{
		double totalObtainedMarks=marks1+marks2+marks3;
		double percentage=(totalObtainedMarks/300)*100;
		String grade;
		if(percentage>=91) grade= "A+";
		else if(percentage>=81) grade= "A";
		else if(percentage>=71) grade= "B";
		else grade="Fail";
		 
		map.put("name",name);
		map.put("rollNo",rollNo);
		map.put("totalObtainedMarks",totalObtainedMarks);
		map.put("grade", grade);
		return "admission-success";
		
		
		 
	}
}


	
//	@RequestMapping("/studentGradeCalculator")
//	public String GradeCalculator()
//	{
//		//Student student=new Student();
//		//double totalObtainedMarks=student.getMarks1()+student.getMarks2()+student.getMarks3();
//		double percentage=(totalObtainedMarks/300)*100;
//		if(percentage>=91) return "A+";
//		else if(percentage>=81) return "A";
//		else if(percentage>=71) return "B";
//		else return "Fail";
//		//return null;
//		
//	}
	

