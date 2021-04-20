package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;




@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ProductController {
	
@Autowired
private ProductRepository productRepository;

@GetMapping("products")
public List<Product> getProducts() {
    return this.productRepository.findAll();
}
}