package com.megastore.controller;

import com.megastore.model.Product;
import com.megastore.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hot/{count}")
    public Optional<Product> getHotProducts(@PathVariable(name = "count") Integer countProducts) {
        Optional<Product> searchedProducts = productService.findHotProducts(countProducts);
        return searchedProducts;
    }
    @GetMapping("/list")
    public List<Product> showProducts() {
        List<Product> searchedProducts = productService.showProducts();
        return searchedProducts;
    }
}
