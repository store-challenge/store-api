package com.megastore.service;

import com.megastore.model.Categories;
import com.megastore.model.SubCategories;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface SubCategoriesService {
    Optional<SubCategories> findById(Long id);

    List<SubCategories> findSubCategoriesByCategories_Id(long catId);

}
