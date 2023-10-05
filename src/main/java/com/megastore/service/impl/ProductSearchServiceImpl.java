package com.megastore.service.impl;

import com.megastore.model.Product;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductSearchService;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class ProductSearchServiceImpl implements ProductSearchService {
    private final ProductRepository productRepository;

    public ProductSearchServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Collection<Product> search(String query) {
        return productRepository.findAllByNameContainingIgnoreCase(query);
    }
}
