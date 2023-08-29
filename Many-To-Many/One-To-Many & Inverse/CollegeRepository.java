package com.rjcon.hibernateFirst.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.rjcon.hibernateFirst.entity.College;
import com.rjcon.hibernateFirst.util.EntityManagerFactoryUtil;

public class CollegeRepository {

	private EntityManager manager = EntityManagerFactoryUtil.getFactory().createEntityManager();
	


	public String saveCollege(College college) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(college);
		transaction.commit();
		
		return "Data Saved";
	}



	public College getCollegeById(int id) {
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		College college = manager.find(College.class, id);
		transaction.commit();
		
		return college;
	}
	
	
	
}
