package com.nit.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nit.entity.Student;

public interface IStudentRepository extends MongoRepository<Student,String>{
public List<Student> findByDepartment(String department);
@Query(fields ="{studentName:1,marks:1}",value ="{marks:?0,department:?1}")
public List<Object[]> getByMarksAndDepartment(Double marks,String dept);
}
