package com.rjcon.hibernateFirst.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rjcon.hibernateFirst.entity.OrderData;

public class OrderDataRepository {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("rjcon").createEntityManager();
	}
	
	public String saveOrderData(OrderData orderData) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(orderData);
		transaction.commit();
		
		return "Data Inserted";
	}
	
	public String updateOrderData(OrderData orderData) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
				
		transaction.begin();
		manager.merge(orderData);
		transaction.commit();
		
		return "Data Updated";
	}
	
	public String deleteOrderDataById(Integer id) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		OrderData data = manager.find(OrderData.class, id);
		
		transaction.begin();
		manager.remove(data);
		transaction.commit();
		
		System.out.println("Deleting the Order Data: " + data);
		
		return "Deleted Successfully!";
	}
	
	public OrderData getDetailsById(Integer id) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		OrderData data = manager.find(OrderData.class, id);
		transaction.commit();
		
		return data;
		
	}
	
	public List<OrderData> getAllOrderDetails(){
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("FROM OrderData odp");
																					
		return query.getResultList();
	}
	
}
