package com.scaler.demo.project.service;

import com.scaler.demo.project.dto.CartDTO;

import java.util.List;

public interface ICartService {

    public List<CartDTO> loadAllCarts();
}
