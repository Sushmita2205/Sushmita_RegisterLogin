package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.bank.model.Register;
import com.lti.dao.RegistrationDao;
@Service(value="service")
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationDao dao;
	@Override
	public boolean doRegister(Register register) {
		
		int result=dao.registerForWeb(register);
		if(result==1)
			return true;
		else
			return false;
	}
	
	
	public List<Register> getRegistrations() {

		return dao.getAllRegistrations();
	}

}
