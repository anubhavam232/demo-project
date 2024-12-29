package com.scaler.demo.project.service;


import com.scaler.demo.project.model.Category;
import com.scaler.demo.project.model.Product;
import com.scaler.demo.project.repos.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    private CategoryService categoryService;

    ProductServiceImpl(ProductRepository productRepository, CategoryService categoryService){
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }
    @Override
    public Product getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            throw new EntityNotFoundException("Product Not Found");
        }
        return product.get();
    }

    @Override
    public Product createProduct(Product product) {
        Category category = product.getCategory();
        if(category.getId() == null){
            category.setCreatedAt(product.getCreatedAt());
            category.setCreatedBy(product.getCreatedBy());
            Category savedCategory = categoryService.createCategory(category);
            product.setCategory(savedCategory);
        }
        Product savedProduct = productRepository.save(product);

        return savedProduct;
    }
}