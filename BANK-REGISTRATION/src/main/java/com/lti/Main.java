package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lti.bank.model.Register;
import com.lti.controller.RegisterRestController;
import com.lti.service.RegistrationService;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
	 SpringApplication.run(Main.class, args);
		
		
	}

}
