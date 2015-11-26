package com.dev.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.dao.CustomerRepository;
import com.dev.backend.models.Customer;
import com.dev.backend.service.exception.CustomerAlreadyExitsException;
import com.google.common.collect.Lists;

@Service
public class CustomerService implements CustomerOps {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	@Transactional
	public  Customer saveCustomer(Customer customer) throws CustomerAlreadyExitsException {
		//TODO
	}
	
	@Override
	@Transactional
	public  List<Customer> allCustomer() {
		//TODO
	}

	@Override
	@Transactional
	public Customer getCustomerByCode(String code) {
		//TODO
	}

	@Override
	@Transactional
	public void deleteCustomerByCode(String code) {
		//TODO
	}

}
