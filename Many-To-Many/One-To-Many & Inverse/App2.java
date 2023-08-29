package com.rjcon.hibernateFirst;

import java.util.ArrayList;
import java.util.List;

import com.rjcon.hibernateFirst.entity.College;
import com.rjcon.hibernateFirst.entity.Department;
import com.rjcon.hibernateFirst.repository.CollegeRepository;

public class App2 {

	public static void main(String[] args) {
		College college = new College("MNIT Jaipur", "302020");
		
		Department department = new Department("CSE", "Rahul Jha", college);
		Department department1 = new Department("Mech", "Gagan Tyagi", college);
		Department department2 = new Department("Civil", "Himanshu Kaushik", college);
		Department department3 = new Department("EEE", "Ravi Kasana", college);
		Department department4 = new Department("ECE", "Pankaj Kumar", college);
		Department department5 = new Department("Chemical", "Pawan Gupta", college);
		
		List<Department> list = new ArrayList<>();
		list.add(department5);
		list.add(department4);
		list.add(department3);
		list.add(department2);
		list.add(department1);
		list.add(department);
		
		college.setDepts(list);
		CollegeRepository repository = new CollegeRepository();
//		repository.saveCollege(college);
		
		College college2 = repository.getCollegeById(1);
		
		List<Department> departments = college2.getDepts();
			
		for (Department d : departments) {
			System.out.println(d.getCollege());
		}
		
		
	}
}
