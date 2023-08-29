package com.megastore.service;

import com.megastore.model.Product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductService {


    Optional<Product> findById(Long id);

    Collection<Product> findAll(long subcategoryId,
                                Double priceFrom,
                                Double priceTo,
                                String brand,
                                String sortBy,
                                String orderBy,
                                int limit);

    List<Product> findHotProducts(int limit, long catId);

}
