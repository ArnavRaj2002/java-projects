package com.nit.service;

import java.util.List;

import com.nit.entity.Order;

public interface IOrderService {
public Order createOrder(Order order);
public Order	getOrderById(Long id);
public List<Order>	getAllOrders();
public Order updateOrder(Long orderId,Order order);
public void deleteOrder(Long id);
}
