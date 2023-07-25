package com.megastore.controller;

import com.megastore.data.DataContainer;
import com.megastore.data.dto.CategoriesDto;
import com.megastore.facade.CategoriesFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {

    private final CategoriesFacade categoriesFacade;

    public CategoriesController(CategoriesFacade categoriesFacade) {
        this.categoriesFacade = categoriesFacade;
    }
    @GetMapping("/list")
    public ResponseEntity<DataContainer<Collection<CategoriesDto>>> showCategories() {
        return ResponseEntity.ok(new DataContainer<>(categoriesFacade.findAll()));
    }

}
