package com.megastore.service;

import com.megastore.model.Product;
import com.megastore.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

//    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Optional<Product> findHotProducts(Long count) {
        if (count.equals(2L)) {
            Optional<Product> searchedProducts = productRepository.findHotProducts(2L);
            return searchedProducts;
        }
        if (count.equals(4L)) {
            Optional<Product> searchedProducts = productRepository.findHotProducts(4L);
            return searchedProducts;
        }
        Optional<Product> searchedProducts = productRepository.findHotProducts(9L);
        return searchedProducts;
    }


}
