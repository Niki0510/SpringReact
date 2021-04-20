package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Product;
import com.example.demo.ropository.ProductRepository;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	 @Autowired
	    private ProductRepository productRepository;
	@Override
	public void run(String... args) throws Exception {
		this.productRepository.save(new Product(1, "cpu"));
        this.productRepository.save(new Product(2, "Keyboard"));
        this.productRepository.save(new Product(3,"Mouse"));
		
		
	}

}
