package com.megastore.service;

import com.megastore.model.Product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> findProductById(Long id);
    List<Product> findHotProducts(int limit, Long categoryId);
    Collection<Product> findAll(Long subcategoryId,
                                String productName,
                                Double priceFrom,
                                Double priceTo,
                                Long brand,
                                String sortBy,
                                String orderBy,
                                Integer limit);


}
