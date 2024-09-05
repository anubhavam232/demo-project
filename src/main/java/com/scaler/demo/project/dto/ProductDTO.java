package com.scaler.demo.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {
    private int productId;
    private int quantity;
}
