package com.megastore.controller;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;
import com.megastore.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
            @RequestParam(defaultValue = "false") Boolean sortedByNameDESC,
            @RequestParam(defaultValue = "false") Boolean sortedByPriceDESC
    ) {
        Collection<ProductPLPDto> products = new ArrayList<>(productFacade.findAll(limit));
        if (sortedByNameDESC) {
            products = new ArrayList<>(productFacade.findAllSortedByNameDESC(limit));
        } else if (!sortedByNameDESC) {
            products = new ArrayList<>(productFacade.findAllSortedByNameASC(limit));
        } else if (sortedByPriceDESC) {
            products = new ArrayList<>(productFacade.findAllSortedByPriceDESC(limit));
        } else {
            products = new ArrayList<>(productFacade.findAllSortedByPriceASC(limit));
        }
        return ResponseEntity.ok(products);
    }

}
