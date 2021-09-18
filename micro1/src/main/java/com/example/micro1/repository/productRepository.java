package com.example.micro1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.micro1.entity.Product;

@Repository
public interface productRepository extends JpaRepository<Product, Long>{

}
