package com.megastore.data.dto;

import com.megastore.model.Categories;
import com.megastore.model.SubCategories;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class CategoriesDto {
    private Long id;
    private String name;
    private String iconName;

    private String pathUrl;
    private Set<SubCategoriesDto> subCategoriesSet;

    public CategoriesDto(Categories categories) {
        this.id = categories.getId();
        this.name = categories.getName();
        this.iconName = categories.getIconName();
        this.pathUrl = categories.getPathURL();
        initSubcategories(categories);
    }

    private void initSubcategories(Categories categories) {
        Set<SubCategories> subCategories = categories.getSubCategories();
        if (CollectionUtils.isNotEmpty(subCategories)) {
            this.subCategoriesSet = subCategories.stream().map(SubCategoriesDto::new).collect(Collectors.toSet());
        }
    }
}
