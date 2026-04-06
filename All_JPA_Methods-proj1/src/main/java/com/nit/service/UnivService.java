package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.entity.University;
import com.nit.exception.IDNotFoundException;
import com.nit.repo.IStudentRepository;
import com.nit.repo.IUniversityRepository;
@Service
public class UnivService {
	@Autowired
IStudentRepository studentRepo;
	@Autowired
IUniversityRepository univRepo;
	public String saveUniversity(University u)
	{
		University university = univRepo.save(u);
		return "university data saved sucessfully with id:: "+university.getUnivId();
	}
	public String saveStudent(Student s)
	{
		Student student=studentRepo.save(s);
		return "student data saved sucessfully with id:: "+student.getStuId();
	}
	public List<University> findUniversity()
	{
		List<University> all = univRepo.findAll();
		return all;
	}
	public List<Student> findStudent()
	{
		return studentRepo.findAll();
	}
	public University findUniversityById(Integer id)
	{
		return  	 univRepo.findById(id).orElseThrow(()->new IDNotFoundException(id+" :: Not Found in University DB !!"));
 		
	}
	public Student findStudentById(Long id)
	{
		return studentRepo.findById(id).orElseThrow(()->new IDNotFoundException(id+" :: Not Found in Student DB !!"));
	}
}
