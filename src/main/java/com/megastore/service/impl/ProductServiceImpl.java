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
    public Collection<Product> findAll(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand) {
        return productRepository.findAll(limit, subcategoryId, priceFrom, priceTo, brand);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByNameDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand) {
        return productRepository.findAllSortedByNameDESC(limit, subcategoryId, priceFrom, priceTo, brand);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByNameASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand) {
        return productRepository.findAllSortedByNameASC(limit, subcategoryId, priceFrom, priceTo, brand);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByPriceDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand) {
        return productRepository.findAllSortedByPriceDESC(limit, subcategoryId, priceFrom, priceTo, brand);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAllSortedByPriceASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand) {
        return productRepository.findAllSortedByPriceASC(limit, subcategoryId, priceFrom, priceTo, brand);
    }

}
