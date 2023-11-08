package com.megastore.service;

import com.megastore.model.Brand;

import java.util.Collection;

public interface BrandService {
    Collection<Brand> findAll();

    Collection<Brand> findAllBySubcategory_Id(Long subcategoryId);

    Collection<Brand> findAllByProducts_Id(String productName);
}
