package com.spring.shopping.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.shopping.Entity.Customer;

public interface ProductRepository extends CrudRepository<Customer, Integer>{

}
