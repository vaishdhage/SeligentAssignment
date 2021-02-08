package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.pojos.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
