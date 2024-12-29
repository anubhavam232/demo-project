package com.scaler.demo.project.service;


import com.scaler.demo.project.model.Product;

public interface ProductService {
    Product getProductById(Long id);

    Product createProduct(Product product);
}
