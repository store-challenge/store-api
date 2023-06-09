package com.project.megastore.controllers;

import com.project.megastore.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version1/catalog/get")
public class ApplicationController {

    @GetMapping("/{id}")
    public Article findById(@PathVariable Long id) {
        if (id != 0) {
            Article article = new Article(1L, "Goods1", 123.45);
            return article;
        } else {
            return new Article(2L, "Goods2", 67.89);
        }
    }
}
