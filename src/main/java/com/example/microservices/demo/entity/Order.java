package com.example.microservices.demo.entity;

import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;


@Entity
@Table(name="ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
	
	@Id
	@GeneratedValue
	private int Id;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String name;
	private int qty;
	private double price;
	
	

}
