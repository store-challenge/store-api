package com.megastore.service;

import com.megastore.model.Product;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface ProductService {
    Optional<Product> findProductById(Long id);

    Set<Product> findHotProducts(int limit, Long categoryId);

    Collection<Product> findAll(Long subcategoryId,
                                String productName,
                                Double priceFrom,
                                Double priceTo,
                                Set<Long> brands,
                                String sortBy,
                                String orderBy,
                                Integer limit);


}
