package com.megastore.service;

import com.megastore.model.Brand;

import java.util.Collection;

public interface BrandService {
    Collection<Brand> findAll(Long subcategoryId, String productName);

}
