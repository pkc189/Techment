package com.techment;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book9211")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bookId;
	String bookName;
	
	@ManyToOne
	@JoinColumn(name="library_id")
	Library library;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Book() {
		
	}
	
	public Book(String bookName, Library library) {
		super();
		this.bookName = bookName;
		this.library = library;
	}
	
	
	
	
	
}
