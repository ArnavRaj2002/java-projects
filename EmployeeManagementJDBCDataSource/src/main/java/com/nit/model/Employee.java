package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
private long empId;
private String empName;
private String dept;
private Double salary;
//private Integer deptNo;
}
