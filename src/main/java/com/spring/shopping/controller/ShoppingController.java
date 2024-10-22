package com.spring.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.shopping.Entity.Product;

@RestController
public class ShoppingController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring !!!";
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		System.out.println("Inside Get product");
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1,"Top","",20,5));
		return new ResponseEntity((HttpStatusCode) productList); 
		
	}
	
}
