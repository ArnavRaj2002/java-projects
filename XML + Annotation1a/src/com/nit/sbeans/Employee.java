package com.nit.sbeans;
public class Employee {

	private String name;
	private String department;
	 
	 // ✅ No-arg constructor const is called 
    public Employee() {
        System.out.println("Employee: No-arg constructor called");
    }

    // ✅ Parameterized constructor
    public Employee(String name, String department) {
        System.out.println("Employee: Parameterized constructor called");
        this.name = name;
        this.department = department;
    }
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	 
	
	
	
}
