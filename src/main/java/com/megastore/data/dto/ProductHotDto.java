package com.megastore.data.dto;

import com.megastore.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class ProductHotDto {
    private Long id;
    private String title;
    private BigDecimal price;
    private String description;
    private boolean isHot;
    private String productBrand;
    private Integer productAvailable;
    private Integer productArticle;
    private Long subcategoryId;
    private Long categoryId;
    private String name;
    private String iconName;


    public ProductHotDto(Product product) {
        this.id = product.getId();
        this.title = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.isHot = product.getIsHotProduct();
        this.productBrand = product.getProductBrand();
        this.productAvailable = product.getProductAvailable();
        this.productArticle = product.getProductArticle();
        this.subcategoryId = product.getSubCategories().getId();
        this.categoryId = product.getSubCategories().getCategories().getId();
        this.name = product.getSubCategories().getCategories().getName();
        this.iconName = product.getSubCategories().getCategories().getIconName();
    }
}
