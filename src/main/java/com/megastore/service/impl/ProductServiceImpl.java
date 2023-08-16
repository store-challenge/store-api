package com.megastore.service.impl;

import com.megastore.model.Product;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductService;
import lombok.RequiredArgsConstructor;
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
        return productRepository.findTopByIsHotProduct(limit, catId);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAll(int limit) {
        return productRepository.findAll(limit);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByNameDESC(int limit) {
        return productRepository.findAllSortedByNameDESC(limit);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByNameASC(int limit) {
        return productRepository.findAllSortedByNameASC(limit);
    }
    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByPriceDESC(int limit) {
        return productRepository.findAllSortedByPriceDESC(limit);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByPriceASC(int limit) {
        return productRepository.findAllSortedByPriceASC(limit);
    }

}
