package com.scaler.demo.project.service;

import com.scaler.demo.project.model.Category;
import com.scaler.demo.project.repos.CategoryRepo;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepo categoryRepo;

    CategoryServiceImpl(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }
}
