package com.example.microservices.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.microservices.demo.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {

}
