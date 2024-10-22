package com.spring.shopping.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.shopping.Entity.Customer;

public interface CustomerRepositoy extends CrudRepository<Customer, Integer> {

}
