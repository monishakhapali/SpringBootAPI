package com.springboot.first.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}
