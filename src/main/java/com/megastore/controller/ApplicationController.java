package com.megastore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/test")
public class ApplicationController {

    @GetMapping("/category")
    public String categories() {
        return new String("Hello categories!");
    }
    @GetMapping("/sub-category")
    public String subcategories() {
        return new String("Hello subcategories!");
    }
    @GetMapping("/product")
    public String products() {
        return new String("Hello products!");

    }
}
