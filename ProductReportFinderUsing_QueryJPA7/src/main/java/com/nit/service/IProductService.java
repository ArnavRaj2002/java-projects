package com.nit.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Product;

public interface IProductService {
	@Query("FROM Product p WHERE p.category = :category")
    List<Product> getProductsByCategory(String category);

    //Find all available products
    @Query("FROM Product p WHERE p.available = true")
    List<Product> getAvailableProducts();

    //Find products with price greater than given value
    @Query("FROM Product p WHERE p.price > :minPrice")
    List<Product> getProductsCostlierThan(Double minPrice);

    //Find products ordered by price descending
    @Query("FROM Product p ORDER BY p.price DESC")
    List<Product> getAllProductsSortedByPriceDesc();

    //Count total available products
    @Query("SELECT COUNT(p) FROM Product p WHERE p.available = true")
    Long getAvailableProductCount();

}
