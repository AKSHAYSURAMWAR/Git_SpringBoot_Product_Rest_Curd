package com.rest.crud.service;

import java.util.List;

import com.rest.crud.model.Product;

public interface ProductService {
	
	public void saveDetails(Product p);
	
	public List<Product> showAllDetail();
	
	public Product updateDetails(Product p, String name);
	
	public void deleteProduct(int id);
	
	public Product getSigleProductDetails(int id); 
	
	public List<Product> getDataByName(String name); 

	public List<Product> getByCategory(String category);
	
	public List<Product> getByBrand(String brand);
	
	public List<Product> getByBranAndCategory(String brand, String Category);
	
	public List<Product> pagingAndSorting(int pageno, int pagesize);
	
}
