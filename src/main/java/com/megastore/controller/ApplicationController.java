package com.megastore.controller;

import com.megastore.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @GetMapping("/home")
    public String home() {
        return new String("Hello MegaStore!");
    }

    @GetMapping("/home/hotProducts")
    public List<Product> getHotProducts(List<Product> productList) {
        return productList.stream()
                .filter(hotProducts -> hotProducts.getIsHotProduct().equals(true))
                .limit(9)
                .collect(Collectors.toList());

    }
}
