package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Product;
import com.nit.repo.IProductRepo;
@Service
public class ProductService implements IProductService{
	@Autowired
private IProductRepo prodRepo;
	@Override
	public List<Product> getProductsByCategory(String category) {
		return 	 prodRepo.getProductsByCategory(category);
	}

	@Override
	public List<Product> getAvailableProducts() {
		 
		return  prodRepo.getAvailableProducts();
	}

	@Override
	public List<Product> getProductsCostlierThan(Double minPrice) {
		 
		return prodRepo.getProductsCostlierThan(minPrice);
	}

	@Override
	public List<Product> getAllProductsSortedByPriceDesc() {
		 
		return prodRepo.getAllProductsSortedByPriceDesc();
	}

	@Override
	public Long getAvailableProductCount() {//?? how this count internally
		 
		return prodRepo.getAvailableProductCount();
	}

}
