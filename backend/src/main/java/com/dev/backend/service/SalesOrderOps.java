package com.dev.backend.service;

import java.util.List;

import com.dev.backend.models.SalesOrder;
import com.dev.backend.models.SalesOrderVM;
import com.dev.backend.service.exception.SalesOrderAlreadyExitsException;
import com.dev.backend.service.exception.SalesOrderCreateValidationException;

public interface SalesOrderOps {
	
	public SalesOrder saveSalesOrder(SalesOrderVM order)  throws SalesOrderAlreadyExitsException, SalesOrderCreateValidationException;
	public List<SalesOrder> allSalesOrders();
	public SalesOrder getSalesOrderByCode(String code);
	public void deleteSalesOrderByCode(String code);
}
