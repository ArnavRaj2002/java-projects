package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	List<Student> findByCity(String city);
	List<Student> findByGradeGreaterThanEqual(Integer grade);
	List<Student> findByFirstNameStartingWith(String prefix);
	List<Student> findByActiveAndGradeBetween(Integer active, Integer min, Integer max);

}
