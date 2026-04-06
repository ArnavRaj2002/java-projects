package com.nit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nit.entity.Order;
import com.nit.entity.UserResponse;
import com.nit.repo.IOrderRepository;
@Service
public class OrderService {
	@Autowired
	private IOrderRepository orderRepo;
	@Autowired
	private RestTemplate curreRestTemplate;
public String	addOrder(Order o)
	{
	 Integer userId = orderRepo.save(o).getOrderId();	 
	 return "user saved having ID::"+userId;
	}

//public Order	getOrder(Integer userId)
//	{
//		return  orderRepo.findById(userId).get();
//		
//	}

public List<Order>	getAllOrders()
{
	return orderRepo.findAll();
	
}
public void getOrderOrderUser(Integer orderID) //??
{
	String urlPattern="http://localhost:8087/RESTAPI5_UserServicesRestTemplate/user/all";
	//String urlPattern="http://localhost:8087/RESTAPI5_UserServicesRestTemplate/user/find/"+orderID;
	ResponseEntity<UserResponse[]> forEntity = curreRestTemplate.getForEntity(urlPattern,UserResponse[].class);
	System.out.println(forEntity.toString());
 	//System.out.println(forEntity.getBody());
	UserResponse[] body = forEntity.getBody();
 	System.out.println(Arrays.toString(body));
 	System.out.println(forEntity.getHeaders());
	System.out.println(forEntity.getStatusCode());
	//Order order = orderRepo.findById(orderID).get();
}

}
