package com.megastore.data.dto;

import com.megastore.model.Product;
import com.megastore.model.SubCategories;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class SubCategoriesDto {

    private Long id;
    private String name;
    private String iconName;
    private String pathUrl;
    private List<ProductPLPDto> productList;

    public SubCategoriesDto(SubCategories subCategories){
        this.id= subCategories.getId();
        this.name =subCategories.getName();
        this.iconName = subCategories.getIconName();
        this.pathUrl= subCategories.getPathURL();
        initProducts(subCategories);
    }

    private void initProducts(SubCategories subCategories){
        List<Product> products = subCategories.getProducts();
        if(CollectionUtils.isNotEmpty(products)){
            this.productList= products.stream().map(ProductPLPDto::new).collect(Collectors.toList());
        }
    }
}

