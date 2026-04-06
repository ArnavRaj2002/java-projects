package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/*
 @RequestMapping("/api/employees")

Endpoints:

HTTP Method	              URL	        Description	        Service Method
POST	                  /api/employees	Create new employee	saveEmployee()
GET	                  /api/employees	Fetch all employees	getAllEmployees()
GET	                /api/employees/{id}	Fetch by ID	        getEmployeeById()
PUT	                 /api/employees/{id}	Update employee  	updateEmployee()
DELETE	                 /api/employees/{id}	Delete employee	        deleteEmployee()

 */

import com.nit.entity.Employee;
import com.nit.service.IEmpService;
@RestController
public class EmpController {
	@Autowired
	private IEmpService empService;
@GetMapping("/api/employees") //FETCH ALL RECORDS
public ResponseEntity<List<Employee>> findAllEmp()
{
	List<Employee> allEmpDetails = empService.getAllEmpDetails();
	return new ResponseEntity<List<Employee>>(allEmpDetails,HttpStatus.FOUND);
}
@PostMapping("/api/employees") //SAVE
public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp)
{
	Employee saveEmp = empService.saveEmp(emp);
	return new ResponseEntity<Employee>(saveEmp,HttpStatus.OK);
}
@GetMapping("/api/employees/{id}") //FIND BY ID
public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") Long id)
{
	Employee empById = empService.getEmpById(id);
	return new ResponseEntity<Employee>(empById,HttpStatus.OK);
	
}
@PutMapping("/api/employees/{id}") //UPDATE
public ResponseEntity<Employee> updateEmp(@PathVariable Long id,@RequestBody Employee emp)
{
	Employee updateEmp = empService.updateEmp(id,emp);
	return new ResponseEntity<Employee>(updateEmp,HttpStatus.OK);
}
@DeleteMapping("/api/employees/{id}") //DELETE
public ResponseEntity<String> deleteEmp(@PathVariable Long id)
{
	empService.deleteEmp(id);
 return	new ResponseEntity<String>("Employee Records having ID::"+id+" deleted Sucessfully !!",HttpStatus.FOUND);
}
}
