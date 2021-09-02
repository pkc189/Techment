package com.techment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="libray9211")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String libraryName;
	
	
	@OneToMany(mappedBy="library")
	Set<Book> books = new HashSet();
	
	
	
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	public Library() {
		
	}
	
	public Library(String libraryName) {
		super();
		this.libraryName = libraryName;
		//this.books = books;
	}
	
	
	
}
