package com.spring.shopping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private double price;
	private int rating;
	
	
	public Product() {
		super();
	}
	public Product(int id, String name, String description, double price, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", rating=" + rating + "]";
	}
	
	
	
	

}
