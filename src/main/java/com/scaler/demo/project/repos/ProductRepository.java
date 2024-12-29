package com.scaler.demo.project.repos;

import com.scaler.demo.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    Optional<Product> findById(Long id);

    void delete(Product product);

    Product save(Product product);
}
