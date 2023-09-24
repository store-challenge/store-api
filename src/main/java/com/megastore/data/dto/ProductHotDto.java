package com.megastore.data.dto;

import com.megastore.model.Images;
import com.megastore.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;


import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class ProductHotDto {
    private Long id;
    private String title;
    private BigDecimal price;
    private String image;
    private boolean isHot;

    public ProductHotDto(Product product) {
        this.id = product.getId();
        this.title = product.getName();
        this.price = product.getPrice();
        this.isHot = product.getIsHotProduct();
        initImages(product);

    }
    private void initImages(Product product){
        List<Images> images = product.getImages();
        if(CollectionUtils.isNotEmpty(images)){
            this.image = images.get(0).getPathImageURL();
        }
    }
}
