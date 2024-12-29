package com.scaler.demo.project.service;


import com.scaler.demo.project.dto.ProductDTO;
import com.scaler.demo.project.model.Product;

public interface ProductService {
    ProductDTO getProductById(Long id);

    ProductDTO createProduct(Product product);
}
