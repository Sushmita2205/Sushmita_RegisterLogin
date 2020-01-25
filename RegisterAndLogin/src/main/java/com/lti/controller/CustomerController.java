package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.CustomerApplication;
import com.lti.model.Register;
import com.lti.model.ResponseMessage;
import com.lti.service.CustomerService;



@RestController
@RequestMapping(path="customers")
@CrossOrigin
public class CustomerController {

	@Autowired
	private CustomerService service;
	@Autowired
	private Register reg;
	
	 private ResponseEntity<ResponseMessage> response;

	// http://localhost:9090/customers
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addCustomer(@RequestBody CustomerApplication customer) {
	
		System.out.println(customer);
		ResponseEntity<String> response;
		boolean result=service.addCustomer(customer);
		if(result)
		{
		response=new ResponseEntity<String>("Customer  is added",HttpStatus.CREATED);	
		}
		else
		{
			response=new ResponseEntity("Customer is not added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;

	}
	/*// http://localhost:9090/customers
		@RequestMapping(path="{customer_id}" ,method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public CustomerApplication findCustomerByC_id(@PathVariable("customer_id") int customer_id) {
			CustomerApplication customer = service.findCustomerByC_id(customer_id);
			return customer;
		}
		public List<CustomerApplication> findAllCustomer() {
			List<CustomerApplication> customer = service.getAllCustomer();

			return customer;
		}
*/
	
	@RequestMapping(path="{customerUsername}/{customerPassword}",method=RequestMethod.GET)
	public ResponseEntity<ResponseMessage> login(@PathVariable("customerUsername") String customerUsername,@PathVariable("customerPassword") String customerPassword){
		System.out.println(customerUsername +" "+ customerPassword);
		reg.setCustomerUserName(customerUsername);
		reg.setCustomerPassword(customerPassword);
		reg=service.validate(reg.getCustomerUsername(),reg.getCustomerPassword());
		System.out.print(reg);

		if(reg==null){
			response=new ResponseEntity<ResponseMessage>(new ResponseMessage("customer is not registered"),HttpStatus.NOT_FOUND);
		}
		else{
			response=new ResponseEntity<ResponseMessage>(new ResponseMessage("login successfull"),HttpStatus.OK);
		}
		return response;
	}
	
	
	@ExceptionHandler(Exception.class)
		public ResponseEntity<String> handleException(Exception ex){
		ResponseEntity<String> error=new ResponseEntity<String>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		return error;
	}
	
	
}
