package com.nit.service;

import java.util.List;

import com.nit.entity.Course;

public interface ICourseService {
public List<Course> coursesList();
public Course getById(Integer id);
public Course saveCustomer(Course course);
public Course updateCourse(Course course,Integer id);
public void deleteCourse(Integer id);

}
