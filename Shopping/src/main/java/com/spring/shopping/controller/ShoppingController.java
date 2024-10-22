package com.spring.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.shopping.Entity.Product;
import com.spring.shopping.service.ProductService;

@RestController
public class ShoppingController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring !!!";
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		System.out.println("Inside Get product");
		
		return new ResponseEntity(productService.getProducts(), HttpStatus.OK));		
	}
	
}
