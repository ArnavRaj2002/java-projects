package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Course;
import com.nit.exception.CourseIDNotFound;
import com.nit.repo.ICourseRepository;

@Service
public class CourseService implements ICourseService {
	@Autowired
	private ICourseRepository courseRepo;

	@Override
	public List<Course> coursesList() {
		return courseRepo.findAll();
	}

//	@Override
//	public Course getById(Integer id) {
// 	return courseRepo.findById(id).orElseThrow(()->new CourseIDNotFound(id+":id not found"));
//	}
	@Override
	public Course getById(Integer id) {
		return courseRepo.findById(id).orElseThrow(() -> new CourseIDNotFound(id + " ::ID not found !!"));
	}

	@Override
	public Course saveCustomer(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public Course updateCourse(Course course,Integer id) 
	{
		if (courseRepo.existsById(id)) 
		{
			return courseRepo.save(course);
		} 
		else {
			throw new CourseIDNotFound(id + " ::ID not found !!");
		}
	}

	@Override
	public void deleteCourse(Integer id) {
		if(!courseRepo.existsById(id))
		{
			throw new CourseIDNotFound(id + "ID not found !!");
		}
		courseRepo.deleteById(id);
	}

}
