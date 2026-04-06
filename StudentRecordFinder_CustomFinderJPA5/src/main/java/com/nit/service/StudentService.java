package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;

	public List<Student> findByCity(String city) {
		if(city.isEmpty() || city==null) {
			 throw  new RuntimeException("city value is null ");
		}
		  
		return studentRepo.findByCity(city);
	}  
	public List<Student> findByGradeGreaterThanEqual(Integer grade)
	{
		return studentRepo.findByGradeGreaterThanEqual(grade);
	}
	public List<Student> findByFirstNameStartingWith(String prefix)
	{
		return studentRepo.findByFirstNameStartingWith(prefix);
		
	}
	public List<Student> findByActiveAndGradeBetween(Integer active, Integer min, Integer max)
	{
		return studentRepo.findByActiveAndGradeBetween(active, min, max);
		
	}
}
