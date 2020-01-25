package com.lti.dao;

import java.util.List;

import com.lti.model.CustomerApplication;
import com.lti.model.Register;;

public interface CustomerDao {
	public int createCustomer(CustomerApplication customer);
	public CustomerApplication readCustomerByC_id(int customer_id);
	public List<CustomerApplication> getAllCustomers();
	
	
	public Register validate(String customerUsername,String customerPassword);
	

	
}