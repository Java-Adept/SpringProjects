package com.spring.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return new ResponseEntity(productService.getProducts(), HttpStatus.OK);		
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		System.out.println("Inside save product");
		return new ResponseEntity(productService.saveProduct(product), HttpStatus.CREATED);	
		
	}
	
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
		System.out.println("Inside update product");
		return new ResponseEntity(productService.updateProduct(id, product), HttpStatus.ACCEPTED);	
		
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable int id) {
		System.out.println("Inside delete product");
		return new ResponseEntity(productService.deleteProduct(id), HttpStatus.OK);	
		
	}
	
}
