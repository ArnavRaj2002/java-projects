package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.clientcomp.IClientComponent;
import com.nit.entity.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private IClientComponent client;
	@GetMapping("/display")
public String display()
{
		Order o=new Order("order@586","Wholesale Order");
		System.out.println("client component class name :: "+client.getClass());  
	return "Order Details :=> "+o+"   :: Fetched Product Details :=> "+client.productDetailsFetch();
}
}
