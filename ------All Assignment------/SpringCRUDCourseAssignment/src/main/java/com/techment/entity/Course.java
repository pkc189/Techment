package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course201")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Course() {
		
	}
	
	
	public Course(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
