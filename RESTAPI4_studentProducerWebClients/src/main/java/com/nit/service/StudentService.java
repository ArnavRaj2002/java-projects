package com.nit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nit.modal.Student;
@Service
public class StudentService implements IStudentService {
	Map<Integer,Student> stu;
	public StudentService() {
		stu= new HashMap<Integer, Student>();
		stu.put(111,new Student(1, "Arnav", "IT", 85));
		stu.put(222,new Student(2, "Aryan", "CSE", 95));
		stu.put(333,new Student(3, "Pramod", "ECE", 75));
	}
	@Override
	public Student getStudentById(int id) {//111
		Student s=null;
		Collection<Student> student = stu.values();
		for(Student stu:student)
		{
			if(stu.getId()==id)
			{
				s=stu;
				return s;
			}
		}
//		stu.forEach((key,student)->
//		{
//			if(student.getId()==id)
//			
//		});
		//Student student = stu.get(id); //returns Student object based on ID
		return s;
	}

	 
	 

}
