package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentService {
public String saveStudent(Student s);
public String saveAllStudents(List<Student> students);
public List<Student> findAllStudents();
public String findStudentById(String idVal);
public String updateStudent(String idVal);
public String deleteStudentById(String idVal);
public Long countStudents();
public String isStudentExistById(String idVal);
public List<Student> showByDepartment(String department);
public List<Object[]> showByMarksAndDepartment(Double marks,String dept);
}
