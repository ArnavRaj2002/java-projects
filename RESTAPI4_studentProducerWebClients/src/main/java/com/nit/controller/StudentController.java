package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.modal.Student;
import com.nit.service.IStudentService;

@RestController
@RequestMapping("/producer")
public class StudentController {
	@Autowired
	private IStudentService studentService;
@GetMapping("/student/{id}")
public ResponseEntity<Student> getStudentByID(@PathVariable Integer id)
{
	Student studentById = studentService.getStudentById(id);
	System.out.println("StudentController.getStudentByID()");
	return new ResponseEntity<Student>(studentById, HttpStatus.FOUND);
	
}
}
