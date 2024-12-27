package com.scaler.demo.project.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.scaler.demo.project.dto.CartDTO;

import java.util.List;

public interface ICartService {

    public List<CartDTO> loadAllCarts() throws JsonProcessingException;
}
