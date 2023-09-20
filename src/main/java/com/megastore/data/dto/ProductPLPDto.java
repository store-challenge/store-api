package com.megastore.data.dto;

import com.megastore.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ProductPLPDto {


    private Long id;
    private Date updated;
    private String title;
    private Long brand;
    private BigDecimal price;
    private boolean isHot;
    private Integer productAvailable;
    private Integer productArticle;
    private Long subcategoryId;

    public ProductPLPDto(Product product) {
        this.id = product.getId();
        this.updated = product.getUpdated();
        this.title = product.getName();
        this.brand = product.getBrand().getId();
        this.price = product.getPrice();
        this.isHot = product.getIsHotProduct();
        this.productAvailable = product.getProductAvailable();
        this.productArticle = product.getProductArticle();
        this.subcategoryId = product.getSubCategories().getId();

    }
}


