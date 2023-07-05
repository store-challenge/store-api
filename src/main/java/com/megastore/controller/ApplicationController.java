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

    @GetMapping("/categories")
    public String categories() {
        return new String("Hello categories!");
    }
    @GetMapping("/subcategories")
    public String subcategories() {
        return new String("Hello subcategories!");
    }
    @GetMapping("/products")
    public String products() {
        return new String("Hello products!");

    }
}
