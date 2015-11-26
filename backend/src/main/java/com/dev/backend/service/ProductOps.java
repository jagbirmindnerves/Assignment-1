package com.dev.backend.service;

import java.util.List;

import com.dev.backend.models.Product;
import com.dev.backend.service.exception.ProductAlreadyExitsException;
import com.dev.backend.service.exception.ProductDoesNotExitsException;

public interface ProductOps {
	
	public Product saveProduct(Product product)  throws ProductAlreadyExitsException;
	public List<Product> allProducts();
	public double getUnitPriceForProduct(String productCode) throws ProductDoesNotExitsException;
	public Product getProductByCode(String code);
	public void deleteProductByCode(String code);
}
