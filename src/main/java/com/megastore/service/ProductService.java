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

    List<Product> findHotProducts(int limit, long catId);

//    public Optional<ProductPDPDto> productSearch(String name, Long article, String brand, Double priceFrom, Double priceTo, Integer available, Integer limit);

}
