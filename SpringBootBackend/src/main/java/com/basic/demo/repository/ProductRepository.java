package com.basic.demo.repository;

import org.springframework.stereotype.Repository;
import com.basic.demo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
}
 