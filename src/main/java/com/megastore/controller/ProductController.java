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
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hot")
    public Optional<Product> getHotProducts(Integer countProducts) {

        Optional<Product> searchedProducts = productService.findHotProducts();
        searchedProducts.stream().filter(hotProducts -> hotProducts.getIsHotProduct().equals(true))
                .limit(countProducts)
                .collect(Collectors.toList());
        return searchedProducts;
    }
    @GetMapping("/list")
    public List<Product> showProducts() {
        List<Product> searchedProducts = productService.showProducts();
        return searchedProducts;
    }
}
