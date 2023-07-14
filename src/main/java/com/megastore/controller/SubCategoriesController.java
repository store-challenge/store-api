package com.megastore.controller;

import com.megastore.model.SubCategories;
import com.megastore.service.impl.SubCategoriesServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sub-category")
@RequiredArgsConstructor
public class SubCategoriesController {

    private final SubCategoriesServiceImpl subCategoriesServiceImpl;

    @GetMapping("/list")
    public List<SubCategories> showSubCategories(){
        return subCategoriesServiceImpl.findAll();
    }

}
