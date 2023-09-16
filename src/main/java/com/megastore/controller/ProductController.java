package com.megastore.controller;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<ProductHotDto>> getHotProducts(@RequestParam(defaultValue = "4") int limit, @RequestParam(required = false) Long categoryId) {
            return ResponseEntity.ok(new ArrayList<>(productFacade.findHotProducts(limit,categoryId)));
        }

    @GetMapping("/list")
    public ResponseEntity<Collection<ProductPLPDto>> getAllProducts(
            @RequestParam(required = false) Long subcategoryId,
            @RequestParam(defaultValue = "0.00") Double priceFrom,
            @RequestParam(required = false) Double priceTo,
            @RequestParam(defaultValue = "") String brand,
            @RequestParam(defaultValue = "p.updated") String sortBy,
            @RequestParam(defaultValue = "DESC") String orderBy,
            @RequestParam(defaultValue = "9") Integer limit
    ) {
        return ResponseEntity.ok(new ArrayList<>(productFacade.findAll(subcategoryId,
                priceFrom,
                priceTo,
                brand,
                sortBy,
                orderBy,
                limit)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductPDPDto> getProduct(@PathVariable Long id){
        return ResponseEntity.ok(productFacade.findProductById(id));
    }

}
