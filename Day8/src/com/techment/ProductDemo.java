package com.techment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//create a product class:
//id,name,price,quantity
//
//->display all the product 
//->display only those product whose price is greater than 500
//->sort the product quantity in descending
//->sort the product price in ascending 










class Product{
	
	int id;
	String name;
	int price;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "";
	}
	
	
	
}


class ProductDesc implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.quantity < o2.quantity)
			return 1;
		else if(o1.quantity==o2.quantity) return 0;
		else return -1;
		
	
	}
	
}


class ProductAsc implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.price>o2.price)
			return 1;
		else return -1;
		
		
	}
	
}


public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> st = new ArrayList<Product>();
		
		st.add(new Product(1,"Wheat",1000,123));
		st.add(new Product(2,"Rice",100,13));
		st.add(new Product(3,"Laptop",50000,12));
		
		
		// Display ALL PRoduct
		
		
		for(Product p : st)
		{
			System.out.println(p);
		}
		
		
		// Sort by Quan
		System.out.println("\n Sorted by quan ");
		Collections.sort(st,new ProductDesc());
		
		for(Product p : st)
		{
			System.out.println(p);
		}
		
		
		// Only 500
				System.out.println("\n only above 500 ");
				//Collections.sort(st,new ProductAsc());
				for(Product p : st)
				{ if(p.price>500)
					System.out.println(p);
				}
		
		
		// Sort by price
		System.out.println("\n Sorted by price ");
		Collections.sort(st,new ProductAsc());
		for(Product p : st)
		{
			System.out.println(p);
		}
		
		
		
		
		
	}

}
