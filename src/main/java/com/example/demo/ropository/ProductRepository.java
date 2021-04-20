package com.example.demo.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}