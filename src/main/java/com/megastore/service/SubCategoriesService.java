package com.megastore.service;

import com.megastore.model.Categories;
import com.megastore.model.SubCategories;

import java.util.Collection;
import java.util.Optional;

public interface SubCategoriesService {
    Optional<SubCategories> findById(Long id);

    Collection<SubCategories> findAll();

}
