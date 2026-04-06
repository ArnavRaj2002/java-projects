package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nit.entity.Order;
import com.nit.service.OrderService;
//RestTemplate and WebClient are used IN THE CONSUMER to call the Producer API.
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private RestTemplate currentRestTemplate;
	@GetMapping("/all")
public ResponseEntity<List<Order>> findAll()
{
	List<Order> allUsers = orderService.getAllOrders();
	return new ResponseEntity<List<Order>>(allUsers, HttpStatus.FOUND);
}
//@GetMapping("/find/{id}")
//public Order getOrderById(@PathVariable("id") Integer id1)
//{
//	 Order order = orderService.getOrder(id1);
//	return order;
//}
@PostMapping("/save")
public String saveOrder(@RequestBody Order order)
{
	String msg = orderService.addOrder(order);
	return msg;
	
}
@GetMapping("/order/output/{id}")
public ResponseEntity<OrderResponse> getOrderOutput(@PathVariable Integer id) {
    OrderResponse response = service.getOrderWithUser(id);
    return ResponseEntity.ok(response);
}
@GetMapping("/output/{id}")
public void CombinedOrderResponse(@PathVariable Integer id) //??
{
orderService.getOrderOrderUser(id);
	//String urlPattern="http://localhost:8087/RESTAPI5_UserServicesRestTemplate/user/all";
	  // ResponseEntity<UserResponse> forEntity = currentRestTemplate.getForEntity(urlPattern,UserResponse.class);
}
}
