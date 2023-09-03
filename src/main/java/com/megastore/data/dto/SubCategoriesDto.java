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
    private String icon;
    private long categoryId;
    private String catIdName;



    public SubCategoriesDto(SubCategories subCategories){
        this.id= subCategories.getId();
        this.name =subCategories.getName();
        this.icon = subCategories.getIconName();
        this.categoryId=subCategories.getCategories().getId();
        this.catIdName =subCategories.getCategories().getName();
    }
}

