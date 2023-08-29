package com.rjcon.hibernateFirst.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// Example of OneToMany bi-directional

@Entity
public class College implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String pincode;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "college")
	List<Department> department;

	public College() {
		super();
	}

	public College(String name, String pincode) {
		super();
		this.name = name;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<Department> getDepts() {
		return department;
	}

	public void setDepts(List<Department> department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", pincode=" + pincode + ", depts=" + department + "]";
	}
	
}
