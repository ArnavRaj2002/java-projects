package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Student;
import com.nit.entity.University;
import com.nit.service.UnivService;

@RestController
public class UnivController {
	@Autowired
	UnivService univService;

	@GetMapping("/findAllUni")
	public ResponseEntity<List<University>> findAllUniversity() {
		List<University> university = univService.findUniversity();
		return new ResponseEntity<List<University>>(university, HttpStatus.FOUND);
	}

	@GetMapping("/findAll")
	public List<Student> findAllStudent() {
		List<Student> student = univService.findStudent();
		return student;
	}

	@GetMapping("findUniById/{id}")
	public ResponseEntity<University> findUnivById(@PathVariable Integer id) {
		University universityById = univService.findUniversityById(id);
		return new ResponseEntity<University>(universityById, HttpStatus.FOUND);
	}

	@GetMapping("findStudById/{id}")
	public ResponseEntity<Student> findStudById(@PathVariable Long id) {
		Student studentById = univService.findStudentById(id);
		return new ResponseEntity<Student>(studentById, HttpStatus.FOUND);
	}
	@PostMapping("/saveUniv")
	public ResponseEntity<String> saveUniversity(@RequestBody University university)
	{
		String saveUniversity = univService.saveUniversity(university);
		return new ResponseEntity<String>(saveUniversity,HttpStatus.CREATED);
	}
	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student)
	{
		String saveStudent = univService.saveStudent(student);
		return new ResponseEntity<String>(saveStudent,HttpStatus.CREATED);
	}
}
