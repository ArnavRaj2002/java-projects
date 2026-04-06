package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "Add_OneToOne")
public class Address {
	@Id
	@SequenceGenerator(name ="s1",sequenceName ="empAdd_sEq1",initialValue =500,allocationSize =10)
	@GeneratedValue(generator ="s1",strategy = GenerationType.SEQUENCE)
	private Long addressId;
@NonNull
	private String street;
@NonNull
	private String city;
@NonNull
	private String state;
@NonNull
	private String zipcode;

}
