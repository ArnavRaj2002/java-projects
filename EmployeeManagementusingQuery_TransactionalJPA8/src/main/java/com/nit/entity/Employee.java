package com.nit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Table(name = "Emp_Jpa")
public class Employee 
{
@Id
private Long id;
private String name;
private String department;
private Double salary;
private LocalDate joiningDate;
}
