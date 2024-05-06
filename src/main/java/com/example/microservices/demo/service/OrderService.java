package com.example.microservices.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.demo.entity.Order;
import com.example.microservices.demo.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	public Order saveOrder(Order order)
	{
		return repository.save(order);
	}

}
