package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
