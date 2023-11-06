package com.megastore.controller;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.BrandFacade;
import com.megastore.facade.ProductFacade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


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
        return ResponseEntity.ok(new ArrayList<>(productFacade.findHotProducts(limit, categoryId)));
    }

    @GetMapping("/list")
    public ResponseEntity<Collection<ProductPLPDto>> getAllProducts(
            @RequestParam(required = false) Long subcategoryId,
            @RequestParam(required = false) String productName,
            @RequestParam(defaultValue = "0.00") Double priceFrom,
            @RequestParam(required = false) Double priceTo,
            @RequestParam(required = false) Set<Long> brands,
            @RequestParam(defaultValue = "updated") String sortBy,
            @RequestParam(defaultValue = "DESC") String orderBy,
            @RequestParam(defaultValue = "9") Integer limit
    ) {
        return ResponseEntity.ok(new ArrayList<>(productFacade.findAll(subcategoryId, productName, priceFrom, priceTo, brands, sortBy, orderBy, limit)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductPDPDto> getProduct(@PathVariable Long id) {
        Optional<ProductPDPDto> productOptional = productFacade.findProductById(id);
        return productOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
