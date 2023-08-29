package com.megastore.service.impl;

import com.megastore.model.Product;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findHotProducts(int limit, long catId) {
        Pageable pageable = PageRequest.of(0, limit);
        return productRepository.findTopByIsHotProduct(pageable, catId);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAll(long subcategoryId,
                                       Double priceFrom,
                                       Double priceTo,
                                       String brand,
                                       String sortBy,
                                       String orderBy,
                                       int limit) {
        return productRepository.findAll(subcategoryId,
                priceFrom,
                priceTo,
                brand,
                sortBy,
                orderBy,
                limit);
    }

}
