package com.basic.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.basic.demo.entity.Product;
import com.basic.demo.service.ProductService;
@CrossOrigin("*")
@RestController
public class ProductController {
	
	private final ProductService productService;
	
	 // Constructor Injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
	
	@PostMapping("/product")
	public Product postProduct(@RequestBody Product product) {
		return productService.postProduct(product);
	}
	
	@GetMapping("/getallproduct")
	public List<Product> getProduct(){
		return productService.getAllProducts();
	}
}
