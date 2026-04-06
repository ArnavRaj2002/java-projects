package com.nit.repo;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
//Employees joined after a given date
	@Query("select e from Employee e where e.dateOfJoining>:lDate")
	public Iterable<Employee> getEmployeeJoinedAfterDate(LocalDate lDate);

//Employees in a department with a specific prefix
	/*
	 * “=” checks for exact equality, not “starts with” or “contains”.
	 * @Query("from Employee e WHERE e.name=:prefixName")
	 */
	@Query("FROM Employee e WHERE e.name LIKE CONCAT(:prefixName, '%')")
	public Iterable<Employee> getEmployeeWithPrefix(String prefixName);

//Active employees only
	@Query("from Employee e Where e.active=:isActive")
	public Iterable<Employee> activeEmployees(Boolean isActive);

}
