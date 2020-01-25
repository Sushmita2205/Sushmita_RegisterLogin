package com.lti.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.CustomerApplication;
import com.lti.model.Register;



@Repository
public class CustomerDaoImpl implements CustomerDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private Register reg;
	

	@Override
	@Transactional
	public int createCustomer( CustomerApplication customer) {
		
		entityManager.persist(customer);
		
		return 1;
	}

	@Override
	public CustomerApplication readCustomerByC_id(int customer_id) {
		return entityManager.find(CustomerApplication.class,customer_id );
		
	}

	@Override
	public List<CustomerApplication> getAllCustomers() {
		String jpql = "From customer";
		TypedQuery<CustomerApplication> typed = entityManager.createQuery(jpql, CustomerApplication.class);

		return typed.getResultList();
	}

	@Override
	public Register validate(String customerUsername,String customerPassword) {
	
		System.out.println("VALIDATE: "+customerUsername);
		String jpql = "from Register s where s.customerUsername=:customer_username";
		TypedQuery<Register> query=entityManager.createQuery(jpql,Register.class);
		query.setParameter("customer_username", customerUsername);
		System.out.println("-----------------REG>");
		reg=query.getSingleResult();
		System.out.println(customerUsername+ " :" + reg.getCustomerUsername());
		System.out.println(customerPassword +" :"+ reg.getCustomerPassword());
		
		if(customerUsername.equals(reg.getCustomerUsername()) && customerPassword.equals(reg.getCustomerPassword()) ){
			System.out.println("done");
			
		}
		else{
			System.out.println("Could not Login");
		}
		
		
		System.out.println("HELLO");
		return reg;
	}
	

}