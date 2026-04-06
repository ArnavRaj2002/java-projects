package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User_restTemp")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer	userId;
private String	name;
private String	email;
private String	location;

}
