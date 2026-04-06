package com.nit.service;

import java.util.List;

import com.nit.model.Product;

public interface IProductService {

String saveProduct(Product p);
String updateProduct(Product p);
String deleteProduct(int id) ;
String getProductById(int id);
List<Product> getAllProducts();
}
