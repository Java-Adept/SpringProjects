package com.spring.shopping.service;

import java.util.List;

import com.spring.shopping.Entity.Product;

public interface ProductService {

	public List<Product> getProducts();
	
	public Product saveProduct(Product product);
	
	public Product updateProduct(int id, Product product);
	
	public String deleteProduct(int id);
	
	
	
}
