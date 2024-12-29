package com.scaler.demo.project.service;


import com.scaler.demo.project.dto.CategoryDTO;
import com.scaler.demo.project.dto.ProductDTO;
import com.scaler.demo.project.model.Category;
import com.scaler.demo.project.model.Product;
import com.scaler.demo.project.repos.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

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
    public ProductDTO getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            throw new EntityNotFoundException("Product Not Found");
        }

        return convertToDTO(product.get());
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public ProductDTO createProduct(Product product) {
        Category category = product.getCategory();
        if(category.getId() == null){
            category.setCreatedAt(product.getCreatedAt());
            category.setCreatedBy(product.getCreatedBy());
            Category savedCategory = categoryService.createCategory(category);
            product.setCategory(savedCategory);
        }
        Product savedProduct = productRepository.save(product);

        return convertToDTO(savedProduct);
    }

    public ProductDTO convertToDTO(Product product) {
        if (product == null) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setTitle(product.getTitle());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice((long) product.getPrice()); // Assuming you want to convert double to long
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(product.getCategory().getId());
        categoryDTO.setTitle(product.getCategory().getTitle());
        productDTO.setCategory(categoryDTO);

        return productDTO;
    }
}
