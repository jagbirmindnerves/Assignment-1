package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.backend.models.Customer;
import com.dev.backend.models.Product;
import com.dev.backend.models.SalesOrder;
import com.dev.backend.models.SalesOrderVM;
import com.dev.backend.service.CustomerOps;
import com.dev.backend.service.ProductOps;
import com.dev.backend.service.SalesOrderOps;
import com.dev.backend.service.exception.CustomerAlreadyExitsException;
import com.dev.backend.service.exception.ProductAlreadyExitsException;
import com.dev.backend.service.exception.ProductDoesNotExitsException;
import com.dev.backend.service.exception.SalesOrderAlreadyExitsException;
import com.dev.backend.service.exception.SalesOrderCreateValidationException;

@Controller
public class MainController {
	
	@Autowired
	private CustomerOps customerOps;
	
	@Autowired
	private ProductOps productOps;

	@Autowired
	private SalesOrderOps salesOrderOps;
	
	
}
