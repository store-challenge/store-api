package com.megastore.controller;

import com.megastore.model.Product;
import com.megastore.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hot/{count}")
    public Optional<Product> getHotProducts(@PathVariable(name = "count") Long countProducts) {
        Optional<Product> searchedProducts = productService.findHotProducts(countProducts);
        return searchedProducts;
    }

    @GetMapping("/test")
    public String test() {
        return "productsService.findAll()";
    }
}
