package com.dev.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.dao.ProductRepository;
import com.dev.backend.models.Product;
import com.dev.backend.service.exception.ProductAlreadyExitsException;
import com.dev.backend.service.exception.ProductDoesNotExitsException;
import com.google.common.collect.Lists;

@Service
public class ProductService implements ProductOps {

	
	@Override
	@Transactional
	public  Product saveProduct(Product product) throws ProductAlreadyExitsException {
		//TODO
	}
	
	
	
	@Override
	@Transactional
	public  List<Product> allProducts() {
		//TODO
		
	}

	@Override
	public double getUnitPriceForProduct(String productCode) throws ProductDoesNotExitsException {
		//TODO
	}

	@Override
	@Transactional
	public Product getProductByCode(String code) {
		//TODO
	}



	@Override
	@Transactional
	public void deleteProductByCode(String code) {
		//TODO
	}

}
