package com.spring.shopping.service;

import java.util.List;

import com.spring.shopping.Entity.Customer;
import com.spring.shopping.Entity.Product;

public interface CustomerService {
	

	public List<Customer> getCustomers();
	
	public Customer saveCustomer(Customer customer);
	
	public Customer updateCustomer(int id, Customer customer);
	
	public String deleteCustomer(int id);

}
