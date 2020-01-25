package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(scopeName="prototype")
@Table(name="register1")

public class Register {
 
	@Id
	@Column(name="CUSTOMER_USERNAME")
	private String customerUsername;
	@Column(name="CUSTOMER_PASSWORD")
	private String customerPassword;
	
	public Register() {
		super();
		
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUserName(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	public Register(String customerUsername, String customerPassword) {
		super();
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
	
	}

	@Override
	public String toString() {
		return "Register [customerUsername=" + customerUsername + ", customerPassword=" + customerPassword
				 + "]";
	}

	
	
}
