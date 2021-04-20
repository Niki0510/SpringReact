package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.ropository.ProductRepository;


	@CrossOrigin(origins = "http://localhost:3002")
	@RestController
	@RequestMapping("api/")
	
	public class ProductController {
	    @Autowired
	    private ProductRepository productRepository;

	    @GetMapping("products")
	    public List <Product> getproducts() {
	        return this.productRepository.findAll();
	    }

}
