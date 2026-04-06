package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmpRepo extends JpaRepository<Employee, Long> 
{
	public Iterable<Employee> findByDepartment(String department);
	//→ Get employees by department.
	
	//select alias from EntityClass alias where alias.field = :param
   // @Query("select e from Employee e where e.salary>:salary")
	@Query("from Employee e where e.salary>:salary")

	public Iterable<Employee> findBySalaryGreaterThan(Double salary);
	//→ Get employees with salary above threshold.
	
	@Transactional
	@Modifying
    @Query("update Employee e set e.salary=e.salary+:sal where e.id=:id")
	public int updateSalaryById(Long id, Double sal);
	//→ Update employee salary. (Requires @Transactional in service)
    
	@Transactional
	@Modifying
    @Query("delete from Employee where name=:name")
	public int deleteByName(String name);
	//→ Delete employee by name. (Requires @Transactional in service)

}
