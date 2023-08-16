package com.megastore.service;

import com.megastore.data.dto.ProductPDPDto;
import com.megastore.model.Categories;
import com.megastore.model.Product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductService {


    Optional<Product> findById(Long id);

    Collection<Product> findAll(int limit);
    Collection<Product> findAllSortedByNameDESC(int limit);
    Collection<Product> findAllSortedByNameASC(int limit);
    Collection<Product> findAllSortedByPriceDESC(int limit);
    Collection<Product> findAllSortedByPriceASC(int limit);
    List<Product> findHotProducts(int limit, long catId);

}
