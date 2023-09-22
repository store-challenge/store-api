package com.megastore.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.megastore.model.Brand;

public class BrandDto {

    @JsonProperty("brandId")
    private Long id;

    @JsonProperty("brandName")
    private String name;


    public BrandDto(Brand brand) {
        this.id = brand.getId();
        this.name = brand.getName();
    }
}
