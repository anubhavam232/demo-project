package com.scaler.demo.project.controller;


import com.scaler.demo.project.model.Product;
import com.scaler.demo.project.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product, @RequestHeader String createdBy){
        product.setCreatedAt(LocalDateTime.now().toString());
        product.setCreatedBy(createdBy);
        return productService.createProduct(product);
    }
}
