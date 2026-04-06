package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor //JPA needs a no-arg constructor to create the empty object first, then sets all field values from the database.”
@RequiredArgsConstructor
public class TravelEntity 
{
@Id
@SequenceGenerator(name="gen1",sequenceName ="Cust_ID",initialValue =1,allocationSize =2)
@GeneratedValue(generator ="gen1",strategy = GenerationType.SEQUENCE)

private Long id;

@NonNull
private String transportationMode;

@NonNull
private Double price;

}
