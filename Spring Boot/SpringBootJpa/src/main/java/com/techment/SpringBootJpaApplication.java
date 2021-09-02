package com.techment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IProductDao iProductDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
        System.out.println("Hello this is my first spring boot");
	
        iProductDao.save(new Product("Laptop", "Electronics", 50000));
        iProductDao.save(new Product("Mobile", "Electronics", 12000));
        System.out.println("Inserted");
        
        
        List<Product> products = iProductDao.findAll();
        products.forEach(System.out::println);
	}

}
