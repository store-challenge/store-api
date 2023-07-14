package com.megastore.service;

import com.megastore.model.Categories;
import com.megastore.model.Product;

import java.util.Collection;
import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);

    Collection<Product> findAll();
    Optional<Product> findHotProducts();

}
