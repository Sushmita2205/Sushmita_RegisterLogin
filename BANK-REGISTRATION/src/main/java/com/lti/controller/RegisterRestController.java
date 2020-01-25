package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.bank.model.Register;

import com.lti.service.RegistrationService;


@RestController
@RequestMapping(path ="register")
@CrossOrigin 
public class RegisterRestController {

	@Autowired
	private RegistrationService service;

	// http://localhost:8181/register
	

	// http://localhost:9090/students/100


	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Register> findAllRegisters() {
		List<Register> register = service.getRegistrations();

		return register;
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void register(@RequestBody Register register) {
		System.out.println(register);
		service.doRegister(register);

	}
	
			
			
			
		
}
