package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course301")
public class Course {

	@Id
	int id;
	String courseName;
	int duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Course() {
		
	}
	
	public Course(int id, String courseName, int duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
	}
	
	
	
}
