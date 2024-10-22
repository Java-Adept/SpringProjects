package com.spring.shopping.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.shopping.Entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
