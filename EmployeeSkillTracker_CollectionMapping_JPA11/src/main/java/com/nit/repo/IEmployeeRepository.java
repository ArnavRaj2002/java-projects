package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
//@Query("select e from Employee e where e.skills=:skill")
	 @Query("SELECT e FROM Employee e JOIN e.skills s WHERE s = :skillName")
	 public List<Employee> findBySkillName(@Param("skillName") String skillName);

}
