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
    public Optional<Product> findHotProducts(Integer count) {
        if (count.equals(2)) {
            Optional<Product> searchedProducts = productRepository.findHotProducts(2);
            return searchedProducts;
        }
        if (count.equals(4)) {
            Optional<Product> searchedProducts = productRepository.findHotProducts(4);
            return searchedProducts;
        }
        Optional<Product> searchedProducts = productRepository.findHotProducts(9);
        return searchedProducts;
    }

    @Transactional(readOnly = true)
    public List<Product> showProducts() {
        List<Product> searchedProducts = productRepository.findAll();
        return searchedProducts;
    }


}
