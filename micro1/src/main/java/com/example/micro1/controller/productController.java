package com.example.micro1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.micro1.entity.Product;
import com.example.micro1.service.productService;

@RestController
public class productController {

	@Autowired
	public productService productService;
	
	
	
	@PostMapping("/GetProductInfo")
	public Product storing(@RequestBody Product product) {
		

		return productService.saveRecord(product);
	}
	
	
	@GetMapping("/GetProductInfo")
	public List<Product> getAllRecords()
	{
		
		return productService.getAllRecordService();
		
		
	}
}
