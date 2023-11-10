package com.megastore.data.dto;

import com.megastore.model.Images;
import com.megastore.model.Product;
import com.megastore.util.DiscountUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class ProductPLPDto {

    private Long id;
    private Date updated;
    private String title;
    private Long brandId;
    private String brandName;
    private BigDecimal price;
    private boolean isHot;
    private Integer productAvailable;
    private Integer productArticle;
    private Long categoryId;
    private String categoryName;
    private Long subcategoryId;
    private String subcategoryName;
    private BigDecimal discount;
    private BigDecimal discountPrice;
    private String image;

    public ProductPLPDto(Product product) {
        this.id = product.getId();
        this.updated = product.getUpdated();
        this.title = product.getName();
        this.brandId = product.getBrand().getId();
        this.brandName = product.getBrand().getName();
        this.price = product.getPrice();
        this.isHot = product.getIsHotProduct();
        this.productAvailable = product.getProductAvailable();
        this.productArticle = product.getProductArticle();
        this.subcategoryId = product.getSubCategories().getId();
        this.subcategoryName = product.getSubCategories().getName();
        this.categoryId = product.getSubCategories().getCategories().getId();
        this.categoryName = product.getSubCategories().getCategories().getName();
        this.discount = product.getProductDiscount();
        this.discountPrice = DiscountUtil.countDiscountPrice(price, discount);
        this.image = product.getImages().get(product.getImages().size()-1).getPathImageURL();
    }
}


