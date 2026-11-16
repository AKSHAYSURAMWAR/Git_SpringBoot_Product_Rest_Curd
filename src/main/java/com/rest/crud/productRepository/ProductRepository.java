package com.rest.crud.productRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.crud.model.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByName(String name);
	
	public List<Product> findByCategory(String category);

	public List<Product> findByBrand(String Brand);
	
	public List<Product> findByBrandAndCategory(String brand, String category);
	
	
}
