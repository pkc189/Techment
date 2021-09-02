package com.techment.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept400")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	
	// one dept have many emp
	@OneToMany
	@JoinColumn(name="empid")
	List<Employee> employees;

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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
		
	}
	public Department( String name, List<Employee> employees) {
		super();
	
		this.name = name;
		this.employees = employees;
	}
	
	
	
	
	
	
	
	
	
	
}
