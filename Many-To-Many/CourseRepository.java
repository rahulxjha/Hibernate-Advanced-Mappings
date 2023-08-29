package com.rjcon.hibernateFirst.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.rjcon.hibernateFirst.entity.Course;
import com.rjcon.hibernateFirst.util.EntityManagerFactoryUtil;

public class CourseRepository {

	private EntityManager manager = EntityManagerFactoryUtil.getFactory().createEntityManager();
	
	public String saveCourse(Course course) {
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(course);
		transaction.commit();
		
		return "Course saved"; 
	}
	
	public String saveAllCourses(List<Course> courses) {
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		for (Course course : courses) {
			manager.persist(course);
		}
		transaction.commit();
		
		return "All courses saved";		
	}
	
}
