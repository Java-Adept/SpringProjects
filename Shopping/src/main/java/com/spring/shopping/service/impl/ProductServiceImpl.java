package com.spring.shopping.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.shopping.Entity.Customer;
import com.spring.shopping.Entity.Product;
import com.spring.shopping.dao.ProductRepository;
import com.spring.shopping.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getProducts() {
		Iterable<Product> products= repository.findAll();
		List<Product> list=new ArrayList<>();
		products.forEach(list::add);
		return list;
	}

	@Override
	public Product saveProduct(Product product) {
		Product p= repository.save(product);
		return p;
	}

	@Override
	public Product updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
