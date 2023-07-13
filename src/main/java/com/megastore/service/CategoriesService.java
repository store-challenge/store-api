package com.megastore.service;

import com.megastore.model.Categories;

import java.util.Collection;
import java.util.Optional;

public interface CategoriesService {
    Optional<Categories> findById(Long id);

    Collection<Categories> findAll();


}
