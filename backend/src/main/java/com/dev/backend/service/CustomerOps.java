package com.dev.backend.service;

import java.util.List;

import com.dev.backend.models.Customer;
import com.dev.backend.service.exception.CustomerAlreadyExitsException;

public interface CustomerOps {
	
	public Customer saveCustomer(Customer customer)  throws CustomerAlreadyExitsException;
	public List<Customer> allCustomer();
	public Customer getCustomerByCode(String code);
	public void deleteCustomerByCode(String code);
}
