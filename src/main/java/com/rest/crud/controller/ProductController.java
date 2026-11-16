package com.rest.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.model.Product;
import com.rest.crud.service.ProductService;

@RestController
public class ProductController {

	private ProductService service;
	
	public ProductController(ProductService productService) {
		
		this.service = productService;
	}
	
	@PostMapping("/saveDetails")
	public void saveProductDetails(@RequestBody Product p) {
		
		service.saveDetails(p);
		
	}
	
	@GetMapping("/showDetails")
	public List<Product> showAllProductDetails(){
		
		List<Product> showAllDetail = service.showAllDetail();
		
		return showAllDetail;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		
		service.deleteProduct(id);
	}
	
	@GetMapping("/getSingleData/{id}")
	public Product getSingleData(@PathVariable int id) {
		
		Product sigleProductDetails = service.getSigleProductDetails(id);
		return sigleProductDetails;
	}
	
	@GetMapping("/getDataByName/{name}")
	public List<Product> getDataByName(@PathVariable String name){
		
		List<Product> dataByName = service.getDataByName(name);
		
		return dataByName;
	}
	
	@GetMapping("/getDataByBrand/{brand}")
	public List<Product> getDataByBrand(@PathVariable String brand){
		
		List<Product> dataByName = service.getByBrand(brand);
		
		return dataByName;
	}
	
	@GetMapping("/getDataByCategory/{category}")
	public List<Product> getDataByCategory(@PathVariable String category){
		
		List<Product> dataByName = service.getByCategory(category);
		
		return dataByName;
	}
	
	@GetMapping("/getDataByBrandAndCategory/{brand}/{category}")
	public List<Product> getDataByBrandAndCategory(@PathVariable String brand,@PathVariable String category){
		
		List<Product> dataByName = service.getByBranAndCategory(brand, category);
		
		return dataByName;
	}
	
	@GetMapping("/pageingAndSorting/{pageno}/{pagesize}")
	public List<Product> getPageingAndSorting(@PathVariable int pageno, @PathVariable int pagesize){
		
		List<Product> pagingAndSorting = service.pagingAndSorting(pageno, pagesize);
		
		return pagingAndSorting;
	}
	
	
	public void demoAddMethod() {
		
		
	}
	
}
