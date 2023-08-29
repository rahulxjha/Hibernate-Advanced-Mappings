package com.rjcon.hibernateFirst;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.rjcon.hibernateFirst.entity.Course;
import com.rjcon.hibernateFirst.entity.Student;
import com.rjcon.hibernateFirst.repository.CourseRepository;

public class App4 {

	public static void main(String[] args) {
		Student student = new Student("Rahul Jha", Date.valueOf(LocalDate.of(2000, 9, 2)));
		Student student1 = new Student("Gagan Tyagi", Date.valueOf(LocalDate.of(2000, 3, 30)));
		Student student2 = new Student("Ravi Kasana", Date.valueOf(LocalDate.of(2000, 2, 4)));
		Student student3 = new Student("Himanshu Kaushik", Date.valueOf(LocalDate.of(2000, 5, 9)));
		Student student4 = new Student("Pankaj Kumar", Date.valueOf(LocalDate.of(2000, 10, 26)));
	
		List<Student> students = new ArrayList<>();
		students.add(student4);
		students.add(student3);
		students.add(student2);
		students.add(student1);
		students.add(student);
		
		Course course = new Course("MERN", 25);
		Course course1 = new Course("CORE JAVA", 25);
		Course course2 = new Course("Python", 25);
		
		course.setStudents(students);
		course1.setStudents(students);
		course2.setStudents(students);
		
		List<Course> courses = new ArrayList<>();
		courses.add(course);
		courses.add(course1);
		courses.add(course2);
		
		student.setCourses(courses);
		student1.setCourses(courses);
		student2.setCourses(courses);
		student3.setCourses(courses);
		student4.setCourses(courses);
		
		CourseRepository repository = new CourseRepository();
		repository.saveAllCourses(courses);
		
	}
	
}
