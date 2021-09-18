package com.example.micro1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.micro1.entity.Product;
import com.example.micro1.repository.productRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class productService {

	
	@Autowired
	private productRepository ProductRepository;
	
	public Product saveRecord(Product product) {
//		log.info("product.getClass()");
		System.out.print(product);
		return ProductRepository.save(product);
	}

	public List<Product> getAllRecordService() {
		// TODO Auto-generated method stub
		return ProductRepository.findAll();
	}
	
	
	
}
