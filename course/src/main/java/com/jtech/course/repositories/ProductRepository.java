package com.jtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtech.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
