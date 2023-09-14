package com.megastore.service;

import com.megastore.model.Categories;
import com.megastore.model.Product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> findProductById(Long id);
    Collection<Product> findAll();
    List<Product> findHotProducts(int limit, Long categoryId);



    Collection<Product> findAll(long subcategoryId,
                                double priceFrom,
                                double priceTo,
                                String brand,
                                String sortBy,
                                String orderBy,
                                int limit);


}
