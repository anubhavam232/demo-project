package com.scaler.demo.project.dto;

import com.scaler.demo.project.model.Category;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class ProductDTO implements Serializable {
    private long id;
    private String title;
    private String description;
    private long price;
    private Category category;
}
