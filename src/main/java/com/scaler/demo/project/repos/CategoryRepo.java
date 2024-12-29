package com.scaler.demo.project.repos;

import com.scaler.demo.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
