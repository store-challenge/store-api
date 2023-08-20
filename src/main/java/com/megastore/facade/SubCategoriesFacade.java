package com.megastore.facade;

import com.megastore.data.dto.SubCategoriesDto;

import java.util.Collection;

public interface SubCategoriesFacade {
    Collection<SubCategoriesDto> findSubCategoriesByCategories_Id(long catId);
}
