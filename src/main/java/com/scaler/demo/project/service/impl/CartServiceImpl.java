package com.scaler.demo.project.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scaler.demo.project.dto.CartDTO;
import com.scaler.demo.project.dto.ResponseDTO;
import com.scaler.demo.project.service.ICartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);
    public static final String GET_ALL_CART_URL = "https://fakestoreapi.com/carts";

    //private RestTemplate restTemplate = new RestTemplate();
    @Override
    public List<CartDTO> loadAllCarts() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        logger.info("Inside Service Impl call for load all carts");
        String response = restTemplate.getForObject(GET_ALL_CART_URL , String.class);
        List<CartDTO> carts = new ObjectMapper().readValue(response, new TypeReference<List<CartDTO>>() {});

        return carts;
    }
}
