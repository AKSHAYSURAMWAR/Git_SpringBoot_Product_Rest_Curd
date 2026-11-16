package com.rest.crud.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rest.crud.model.Product;
import com.rest.crud.productRepository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository repository;

	ProductServiceImpl(ProductRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void saveDetails(Product p) {
		
		repository.save(p);
		
	}

	@Override
	public List<Product> showAllDetail() {
		
		List<Product> allDetailslist = repository.findAll();
		return allDetailslist;
	}

	@Override
	public Product updateDetails(Product p, String name) {
		
		Product prod = repository.findById(p.getId()).get();
		
		prod.setName(name);
		
		repository.save(prod);
		
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		
		repository.deleteById(id);
		
	}

	@Override
	public Product getSigleProductDetails(int id) {
		
		Product product = repository.findById(id).get();
		
		return product;
	}

	@Override
	public List<Product> getDataByName(String name) {
		
		List<Product> byName = repository.findByName(name);
		return byName;
	}

	@Override
	public List<Product> getByCategory(String category) {
		
		List<Product> byName = repository.findByCategory(category);
		return byName;
	}

	@Override
	public List<Product> getByBrand(String brand) {
		List<Product> byName = repository.findByBrand(brand);
		return byName;
	}

	@Override
	public List<Product> getByBranAndCategory(String brand, String Category) {
		
		List<Product> byBrandAndCategory = repository.findByBrandAndCategory(brand, Category);
		
		return byBrandAndCategory;
	}

	@Override
	public List<Product> pagingAndSorting(int pageno, int pagesize) {
		
		PageRequest pageRequest = PageRequest.of(pageno, pagesize);
		
		List<Product> content = repository.findAll(pageRequest).getContent();
		
		return content;
	}

	

}
