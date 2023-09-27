package com.megastore.controller;

import com.megastore.data.dto.BrandDto;
import com.megastore.facade.BrandFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/brand")
public class BrandController {
    private final BrandFacade brandFacade;

    public BrandController( BrandFacade brandFacade) {
        this.brandFacade = brandFacade;
    }
    @GetMapping("/list")
    public ResponseEntity<Collection<BrandDto>> getAllBrands() {
        return ResponseEntity.ok(new ArrayList<>(brandFacade.findAll()));
    }
}
