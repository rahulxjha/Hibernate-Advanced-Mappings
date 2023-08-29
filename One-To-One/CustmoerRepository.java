package com.rjcon.hibernateFirst.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.rjcon.hibernateFirst.entity.Customer;
import com.rjcon.hibernateFirst.util.EntityManagerFactoryUtil;

public class CustmoerRepository {

	private EntityManager manager = EntityManagerFactoryUtil.getFactory().createEntityManager();
	
	public String saveCustomer(Customer customer) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
		
		return "Data Saved!";
	}
	
	public Customer getCustomerById(int id) {
		return manager.find(Customer.class, id);
	}
	
}
