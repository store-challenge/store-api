package com.megastore.controller;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;
import com.megastore.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/product")

public class ProductController {

    private final ProductFacade productFacade;

    public ProductController(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    @GetMapping("/hot")
    public ResponseEntity<List<ProductHotDto>> getHotProducts(@RequestParam(defaultValue = "4") int limit, @RequestParam(defaultValue = "1") long catId) {
        return ResponseEntity.ok(new ArrayList<>(productFacade.findHotProducts(limit,catId)));

    }
//    @GetMapping("/list")
//    public List<Product> showProducts() {
//        List<Product> searchedProducts = productServiceImpl.findAll();
//        return searchedProducts;
//    }
}
