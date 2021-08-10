package com.techment.oops.assignment;

import java.util.Scanner;

class Book{
	private int bookno;
	private String title;
	private String author;
	private float price;
	
	
	
	
	public Book(int bookno, String title, String author, float price) {
		super();
		this.bookno = bookno;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}


class EngineeringBook extends Book{


	

	private String Category;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public EngineeringBook(int bookno, String title, String author, float price, String category) {
		super(bookno, title, author, price);
		Category = category;
	}
	
	
	
	
}




public class BookDetails {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("Enter bookno ");
    int bookno = scanner.nextInt();
    
    System.out.println("Enter author ");
   String author = scanner.next();

   System.out.println("Enter title ");
   String title = scanner.next();
  
   System.out.println("Enter Price ");
   int price = scanner.nextInt();
   
   System.out.println("Enter Category ");
   String category = scanner.next();
   
   
   Book book1 = new Book(bookno,title,author,price);
   
   System.out.println("Book no "+book1.getBookno()+"\n Author "+book1.getAuthor()+" \n Title "+book1.getTitle()+"\n Price "+book1.getPrice());
   
   
   EngineeringBook eg1 = new EngineeringBook(bookno,title,author,price,"Hello");
   
   
   System.out.println("Book no "+eg1.getBookno()+"\n Author "+eg1.getAuthor()+" \n Title "+eg1.getTitle()+"\n Price "+eg1.getPrice()+"\n Category "+eg1.getCategory());
   
	}

}
