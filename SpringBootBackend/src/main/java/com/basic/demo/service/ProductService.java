package com.basic.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.basic.demo.entity.Product;
import com.basic.demo.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public Product postProduct(Product product) {
		return productRepository.save(product);  
	}
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}
