package com.scaler.demo.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartDTO {
    private int id;
    private int userId;
    private Date date;
    private List<ProductDTO> products;
    private int __v;


}
