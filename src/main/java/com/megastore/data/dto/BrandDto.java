package com.megastore.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.megastore.model.Brand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
