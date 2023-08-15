package com.megastore.data.dto;

import com.megastore.model.Categories;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class CategoriesDto {
    private Long id;
    private String name;
    private String iconName;

    public CategoriesDto(Categories categories) {
        this.id = categories.getId();
        this.name = categories.getName();
        this.iconName = categories.getIconName();

    }

}
