package com.megastore.data.dto;

import com.megastore.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class ProductPLPDto {


    private Long id;
    private String description;
    private boolean isHot;
    private String title;
    private BigDecimal price;
    private Long subcategoryId;

    public ProductPLPDto(Product product){
        this.id= product.getId();
        this.description= product.getDescription();
        this.isHot = product.getIsHotProduct();
        this.title = product.getName();
        this.price = product.getPrice();
        this.subcategoryId=product.getSubCategories().getId();

    }
}


