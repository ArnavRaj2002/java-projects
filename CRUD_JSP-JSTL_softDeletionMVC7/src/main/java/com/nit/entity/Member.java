package com.nit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Gym_Mvc7")

@SQLDelete(sql = "update Gym_Mvc7 set status='inactive' WHERE id=?")
@SQLRestriction("status <>'inactive'")
//@Where(clause="status <> 'inactive'")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String membershipType;
	@NonNull
	private Double membershipFee;
	@NonNull
	private LocalDate expiryDate;
	
	private String status="active";
}
