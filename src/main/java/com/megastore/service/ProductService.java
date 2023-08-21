package com.megastore.service;

import com.megastore.data.dto.ProductPDPDto;
import com.megastore.model.Categories;
import com.megastore.model.Product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductService {


    Optional<Product> findById(Long id);

    Collection<Product> findAll(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<Product> findAllSortedByNameDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<Product> findAllSortedByNameASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<Product> findAllSortedByPriceDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<Product> findAllSortedByPriceASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    List<Product> findHotProducts(int limit, long catId);

}
