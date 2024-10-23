package com.spring.shopping.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		Optional<Product> prod=repository.findById(id);
		if(prod!=null) {
			Product p=prod.get();
			if(product.getName() != null) {
				p.setName(product.getName());
			}
			if(product.getDescription() != null) {
				p.setDescription(product.getDescription());
			}
			if(product.getPrice() >= 1) {
				p.setPrice(product.getPrice());
			}
			if(product.getRating() >= 1) {
				p.setRating(product.getRating());
			}
			repository.save(p);
			return p;
		}
		
		return null;
	}

	@Override
	public String deleteProduct(int id) {
		Optional<Product> product=repository.findById(id);
		if(product.isPresent()) {
			repository.delete(product.get());
			return "Product deleted succesfully";
		}
		return "Product not deleted";
	}
	

}
