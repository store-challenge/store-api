package com.megastore.data.dto;

import com.megastore.model.Images;
import com.megastore.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductPDPDto {

    private Long id;
    private String title;
    private BigDecimal price;
    private String description;
    private boolean isHot;
    private Integer productAvailable;
    private Integer productArticle;
    private Long subcategoryId;
    private String subcategoryName;
    private Long categoryId;
    private String categoryName;
    private String brand;
    private String image;

    public ProductPDPDto(Product product){
        this.id = product.getId();
        this.title = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.isHot= product.getIsHotProduct();
        this.productAvailable =product.getProductAvailable();
        this.productArticle = product.getProductArticle();
        this.subcategoryId = product.getSubCategories().getId();
        this.subcategoryName = product.getSubCategories().getName();
        this.categoryId = product.getSubCategories().getCategories().getId();
        this.categoryName = product.getSubCategories().getCategories().getName();
        this.brand = product.getBrand().getName();
        initImages(product);
    }
    private void initImages(Product product){
        List<Images> images = product.getImages();
        if(CollectionUtils.isNotEmpty(images)){
            this.image = images.get(0).getPathImageURL();
        }
    }
}
