package com.megastore.controller;

import com.megastore.constans.Sorting;
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
            @RequestParam(defaultValue = "9") int limit,
            @RequestParam(defaultValue = "1") long subcategoryId,
            @RequestParam(defaultValue = "UPDATED") Sorting sort,
            @RequestParam(defaultValue = "0.00") Double priceFrom,
            @RequestParam(defaultValue = "1000000.00") Double priceTo,
            @RequestParam(defaultValue = "") String brand
    ) {
        Collection<ProductPLPDto> products;
        if ((sort.toString()).equals("ALPHABETIC")) {
            products = new ArrayList<>(productFacade.findAllSortedByNameASC(limit, subcategoryId, priceFrom, priceTo, brand));
        } else if ((sort.toString()).equals("REVERSED")) {
            products = new ArrayList<>(productFacade.findAllSortedByNameDESC(limit, subcategoryId, priceFrom, priceTo, brand));
        } else if ((sort.toString()).equals("CHEAP")) {
            products = new ArrayList<>(productFacade.findAllSortedByPriceASC(limit, subcategoryId, priceFrom, priceTo, brand));
        } else if ((sort.toString()).equals("EXPENSIVE")) {
            products = new ArrayList<>(productFacade.findAllSortedByPriceDESC(limit, subcategoryId, priceFrom, priceTo, brand));
        } else {
            products = new ArrayList<>(productFacade.findAll(limit, subcategoryId, priceFrom, priceTo, brand));
        }
        return ResponseEntity.ok(products);
    }

}
