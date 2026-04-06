package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="Vehicle_Info1")
public class Vehicle 
{
@Column(name="Id")	
@Id
private Long id;
@NonNull
private String brand;
@NonNull
private String model;
@NonNull
private Double rentalPricePerDay;
@NonNull
private Boolean available;
 
@Transient
private Double estimatedTotalCost;

public void calculateEstimatedTotalCost(int rentalDays) 
{
    this.estimatedTotalCost = rentalPricePerDay * rentalDays;
}

}
