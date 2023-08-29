package com.rjcon.hibernateFirst.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_data")
public class OrderData implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="product_name", nullable = false, unique = true)
	private String productName;
	
	@Column(nullable = false)
	private Integer quantity;
	
	@Column(name="product_type", nullable = false)
	private String productType;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	
	public OrderData(String productName, Integer quantity, String productType) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.productType = productType;
	}

	public OrderData() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "OrderData [id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", productType="
				+ productType + ", person=" + person + "]";
	}
	
}
