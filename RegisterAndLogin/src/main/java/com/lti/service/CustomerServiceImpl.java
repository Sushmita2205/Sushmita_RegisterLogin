package com.lti.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.model.CustomerApplication;
import com.lti.model.Register;


@Service("service")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao dao;

	public CustomerDao getDao() {
		return dao;
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addCustomer(CustomerApplication customer) {
		int result = dao.createCustomer(customer);
		if (result == 1)
			return true;
		else
			return false;
	}
	
	@Override
	public CustomerApplication findCustomerByC_id(int customer_id) {
		return dao.readCustomerByC_id(customer_id);
	}

	@Override
	public List<CustomerApplication> getAllCustomer() {
		
		return dao.getAllCustomers();
	}

	@Override
	public Register validate(String customerUsername, String customerPassword) {
	
		
		Register reg=dao.validate(customerUsername, customerPassword);
		
		return reg;
	}
}