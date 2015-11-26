package com.dev.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.dao.CustomerRepository;
import com.dev.backend.dao.ProductRepository;
import com.dev.backend.dao.SalesOrderRepository;
import com.dev.backend.models.Customer;
import com.dev.backend.models.OrderLines;
import com.dev.backend.models.OrderLinesVM;
import com.dev.backend.models.Product;
import com.dev.backend.models.SalesOrder;
import com.dev.backend.models.SalesOrderVM;
import com.dev.backend.service.exception.SalesOrderAlreadyExitsException;
import com.dev.backend.service.exception.SalesOrderCreateValidationException;
import com.google.common.collect.Lists;

@Service
public class SalesOrderService implements SalesOrderOps {

	
	@Override
	@Transactional
	public SalesOrder saveSalesOrder(SalesOrderVM salesOrderFromReq) throws SalesOrderAlreadyExitsException, SalesOrderCreateValidationException {
		
		//TODO
	}
	
	@Override
	@Transactional
	public  List<SalesOrder> allSalesOrders() {
		//TODO
	}

	@Override
	public SalesOrder getSalesOrderByCode(String code) {
		//TODO
	}

	@Override
	@Transactional
	public void deleteSalesOrderByCode(String code) {
		//TODO
	}

}
