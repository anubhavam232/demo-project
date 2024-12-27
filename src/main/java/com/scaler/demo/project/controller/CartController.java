package com.scaler.demo.project.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.scaler.demo.project.dto.CartDTO;
import com.scaler.demo.project.service.ICartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    Logger logger = LoggerFactory.getLogger(CartController.class);
    @Autowired
    private ICartService iCartService;

    @GetMapping
    public List<CartDTO> getAllCarts() throws JsonProcessingException {
        logger.info("Inside Controller Class");
        return iCartService.loadAllCarts();

    }

}
