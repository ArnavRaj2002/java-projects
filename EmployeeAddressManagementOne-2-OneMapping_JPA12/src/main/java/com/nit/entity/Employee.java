package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "Emp_OneToOne")
public class Employee {
	@Id
	@SequenceGenerator(name = "s2",sequenceName ="emp_sEQ2",initialValue = 600,allocationSize = 5 )
	@GeneratedValue(generator ="s2",strategy = GenerationType.SEQUENCE)
private Long	empId;
	@NonNull
private String	empName;
@NonNull
private String empDept;
@NonNull
private	Double salary;
@NonNull
@OneToOne(targetEntity =Address.class,
          cascade = CascadeType.ALL,fetch = FetchType.EAGER)//??
@JoinColumn(name ="EmpL_iD",referencedColumnName ="addressId")
private	Address address;



}
