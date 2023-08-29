package com.rjcon.hibernateFirst.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rjcon.hibernateFirst.entity.OrderData;
import com.rjcon.hibernateFirst.entity.Person;

public class PersonRepository {
	private EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("rjcon").createEntityManager();
	}
	
	
	public String savePerson(Person person) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("rjcon");
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		
		return "Data Inserted";
	}
	
	public String updatePersonData(Person person) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
				
		transaction.begin();
		manager.merge(person);
		transaction.commit();
		
		return "Data Updated";
	}
	
	public List<Person> getAllData() {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("FROM Person p");
		return query.getResultList();
	}
	
	public Person getPersonById(int id) {		
		EntityManager manager = getEntityManager();
		return manager.find(Person.class, id);	
	}
	
	public List<Person> getPhoneNumByName(String name) {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("SELECT p.phoneNum FROM Person p WHERE p.name=?1");
		query.setParameter(1, name);
		return query.getResultList();
	}

	public Object getDataByAgeAndPhoneNum(int age, String phoneNum) {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("FROM Person p WHERE p.age=?1 AND p.phoneNum=?2");
		query.setParameter(1, age);
		query.setParameter(2, phoneNum);
		return query.getResultList();
	}
	
}
