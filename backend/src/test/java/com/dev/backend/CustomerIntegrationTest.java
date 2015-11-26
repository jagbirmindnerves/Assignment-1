package com.dev.backend;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.dev.backend.dao.CustomerRepository;
import com.dev.backend.models.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(BackendApplication.class)
@WebAppConfiguration
@TestPropertySource(locations="classpath:test.properties")
public class CustomerIntegrationTest {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;
	
	private String customer1AsString;
	private String defaultCustomersAsString;
	
	private CustomerRepository customerRepository;
	 
	 @Autowired
	 public void setCustomerRepository(CustomerRepository customerRepository) {
		 this.customerRepository = customerRepository;
	 }

	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
		Customer customer = new Customer();
		customer.setCode("CODE_1");
		customer.setName("Name of Code 1");
		try {
			customer1AsString = new ObjectMapper().writeValueAsString(customer);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		Customer defaultCustomer1 = new Customer();
		defaultCustomer1.setCode("default_1");
		defaultCustomer1.setName("Name");
		customerRepository.save(defaultCustomer1);
		
		Customer defaultCustomer2 = new Customer();
		defaultCustomer2.setCode("default_2");
		defaultCustomer2.setName("Name");
		customerRepository.save(defaultCustomer2);
		
		try {
			defaultCustomersAsString = new ObjectMapper().writeValueAsString(Lists.newArrayList(defaultCustomer1,defaultCustomer2));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSaveCustomer() throws Exception {
		this.mvc.perform(post("/v1/customer").contentType("application/json").content(customer1AsString))
		.andExpect(status().isOk()).andExpect(content().string(customer1AsString));
	}
	
	@Test
	public void testGetAllCustomer() throws Exception {
		this.mvc.perform(get("/v1/customer"))
		.andExpect(status().isOk()).andExpect(content().string(defaultCustomersAsString));
	}
	
	@Test
	public void testGetCustomerByCode() throws Exception {
		this.mvc.perform(post("/v1/customer").contentType("application/json").content(customer1AsString));
		this.mvc.perform(get("/v1/customer/CODE_1"))
		.andExpect(status().isOk()).andExpect(content().string(customer1AsString));
	}
	
	@Test
	public void testDeleteCustomerByCode() throws Exception {
		this.mvc.perform(delete("/v1/customer/default_1"))
		.andExpect(status().isOk());
		Customer fetchedCustomer = customerRepository.findOne("default_1");
		Assert.assertNull(fetchedCustomer);
	}
	
	@After  
	public void tearDown() {  
		 customerRepository.deleteAll();
	 }
	
}
