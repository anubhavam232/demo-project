package com.scaler.demo.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel{
    private String title;
    /*@OneToMany(mappedBy = "category")
    private List<Product> productList;*/
}
