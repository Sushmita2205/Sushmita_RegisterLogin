package com.lti.service;

import java.util.List;

import com.lti.model.CustomerApplication;
import com.lti.model.Register;



public interface CustomerService {
	public boolean addCustomer(CustomerApplication customer);
	public CustomerApplication findCustomerByC_id(int customer_id);
	List<CustomerApplication> getAllCustomer();
	public Register validate(String CustomerUsername,String customerPassword);
}
