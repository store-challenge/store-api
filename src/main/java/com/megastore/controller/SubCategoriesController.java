package com.megastore.controller;

import com.megastore.data.DataContainer;
import com.megastore.data.dto.SubCategoriesDto;
import com.megastore.facade.SubCategoriesFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/sub-category")
public class SubCategoriesController {

    private final SubCategoriesFacade subCategoriesFacade;

    public SubCategoriesController(SubCategoriesFacade subCategoriesFacade) {
        this.subCategoriesFacade = subCategoriesFacade;
    }


    @GetMapping("/list")
    public ResponseEntity<DataContainer<Collection<SubCategoriesDto>>> showSubCategories(){
        return ResponseEntity.ok (new DataContainer<>(subCategoriesFacade.findAll()));
    }

}
