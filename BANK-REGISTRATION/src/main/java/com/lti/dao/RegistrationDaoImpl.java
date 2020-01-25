package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.bank.model.Register;
import com.lti.util.JpaUtils;
@Repository
public class RegistrationDaoImpl implements RegistrationDao  {

	
	private EntityManager entityManager;

	public RegistrationDaoImpl() {
		entityManager = JpaUtils.getEntityManager();
	}	
	
	@Override
	public int registerForWeb(Register register) {
		entityManager.getTransaction().begin();
		entityManager.persist(register);
		entityManager.getTransaction().commit();
		return 1;
	}
	
	
	public List<Register> getAllRegistrations() {
		String jpql = "From Register";
		TypedQuery<Register> typed = entityManager.createQuery(jpql, Register.class);

		return typed.getResultList();
	}

	
	
}
