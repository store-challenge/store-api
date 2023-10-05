package com.megastore.controller;

import com.megastore.data.DataContainer;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.SearchProductFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class SearchController {
    private final SearchProductFacade productFacade;

    public SearchController(SearchProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    @GetMapping("/search")
    public ResponseEntity<DataContainer<Collection<ProductPLPDto>>> searchProduct(@RequestParam String query){
        return ResponseEntity.ok( new DataContainer<>(productFacade.search(query)));
    }
}
