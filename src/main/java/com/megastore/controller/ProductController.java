package com.megastore.controller;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductFacade productFacade;

    public ProductController(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    @GetMapping("/hot")
    public ResponseEntity<List<ProductHotDto>> getHotProducts(@RequestParam(defaultValue = "4") int limit, @RequestParam(defaultValue = "1") long catId) {
        return ResponseEntity.ok(new ArrayList<>(productFacade.findHotProducts(limit, catId)));
    }

    @GetMapping("/list")
    public ResponseEntity<Collection<ProductPLPDto>> getAllProducts(
            @RequestParam(defaultValue = "1") long subcategoryId,
            @RequestParam(defaultValue = "0.00") double priceFrom,
            @RequestParam(defaultValue = "10000000.00") double priceTo,
            @RequestParam(defaultValue = "") String brand,
            @RequestParam(defaultValue = "p.updated") String sortBy,
            @RequestParam(defaultValue = "DESC") String orderBy,
            @RequestParam(defaultValue = "9") int limit
    ) {
        return ResponseEntity.ok(productFacade.findAll(subcategoryId,
                priceFrom,
                priceTo,
                brand,
                sortBy,
                orderBy,
                limit));
    }

}
