package com.nit.Maven_SpringBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
@Component
@Scope("singleton")  //100x=>200x
//@Scope("prototype")
public class RentalManager {
@Autowired
@Qualifier("bike")

private VehicleService service;
public void rent(String customer) 
{
	service.rent(customer);
}
}
