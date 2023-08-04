package com.megastore.controller;

import com.megastore.data.DataContainer;
import com.megastore.data.dto.CategoriesDto;
import com.megastore.facade.CategoriesFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/category")
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
