package com.megastore.controller;

import com.megastore.model.Categories;
import com.megastore.service.impl.CategoriesServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoriesController {

    private final CategoriesServiceImpl categoriesServiceImpl;

    @GetMapping("/list")
    public List<Categories> showCategories() {
        return categoriesServiceImpl.findAll();
    }

}
