package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Order_API")
public class Order {
@Id
@SequenceGenerator(name="seq1",sequenceName ="order_seq",initialValue =10,allocationSize =5)
@GeneratedValue(generator ="seq1",strategy = GenerationType.IDENTITY)
private Long	orderId;
private String	customerName;
private String	productName;
private Integer	quantity;
private Boolean	status;

}
