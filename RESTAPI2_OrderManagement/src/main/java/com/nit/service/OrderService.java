package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Order;
import com.nit.exception.OrderIDNotFoundException;
import com.nit.repo.IOrderRepository;
@Service
public class OrderService  implements IOrderService{
	@Autowired
private IOrderRepository orderRepo;
	@Override
	public Order createOrder(Order order) {
		return  orderRepo.save(order);
	}

	@Override
	public Order getOrderById(Long id) {
	return orderRepo.findById(id).orElseThrow(()-> new OrderIDNotFoundException(id+"::ID not found in DB!!"));
	}

	@Override
	public List<Order> getAllOrders() {
 		return orderRepo.findAll();
	}
//using JPA Method ??
	@Override
	public Order updateOrder(Long orderId,Order order) {
 		if(orderRepo.existsById(orderId))
 		{
 		return 	orderRepo.save(order);
  			//return order.getOrderId()+": id records updated sucessfully";  where to pass this service/controller
 		}
 		else {
 			throw new OrderIDNotFoundException(orderId+"::id not exist !!");
 					 
 		}
		
	} 
//		@Override //?? what should be pass in argument id,order 
//	public String updateOrder(Order order) {
//			Order orderById = getOrderById(order.getOrderId());// throws if not found
//			orderById.setOrderId(order.getOrderId());
//			orderById.setCustomerName(order.getCustomerName());
//			orderById.setProductName(order.getProductName());
//			orderById.setQuantity(order.getQuantity());
//			orderById.setStatus(order.getStatus());
//		return order.getOrderId()+"updated sucessfully !!";
//			
//		}
	@Override
	public void deleteOrder(Long id) {
    Order orderById = getOrderById(id);	
    orderRepo.delete(orderById);
	}

	 

}
