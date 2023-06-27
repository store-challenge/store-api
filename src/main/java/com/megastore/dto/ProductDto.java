package com.megastore.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version1")
public class ProductDto {

    @GetMapping("/home")
    public String home() {
        return new String("Hello MegaStore!");
    }
}
