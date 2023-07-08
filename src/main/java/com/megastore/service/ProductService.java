package com.megastore.service;

import com.megastore.model.Product;
import com.megastore.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Optional<Product> findHotProducts() {
        Optional<Product> searchedProducts = productRepository.findHotProducts();
        return searchedProducts;
    }

    @Transactional(readOnly = true)
    public List<Product> showProducts() {
        List<Product> searchedProducts = productRepository.findAll();
        return searchedProducts;
    }


}
