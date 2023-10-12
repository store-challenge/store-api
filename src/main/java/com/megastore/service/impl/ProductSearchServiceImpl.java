package com.megastore.service.impl;

import com.megastore.model.Product;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductSearchService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductSearchServiceImpl implements ProductSearchService {
    private final ProductRepository productRepository;

    public ProductSearchServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> search(String query) {
        query = query.trim();
        if (query.isEmpty()) {
            return Collections.emptyList();
        }
        List<Product> exactMatches = findExactMatches(query);
        List<Product> partialMatches = findPartialMatches(query);

        if (!exactMatches.isEmpty()) {
            partialMatches.removeAll(exactMatches);
            exactMatches.addAll(partialMatches);
            return exactMatches;
        }

        return partialMatches;
    }

    private List<Product> findExactMatches(String query) {
        return (List<Product>) productRepository.findExactMatch(query);
    }

    private List<Product> findPartialMatches(String query) {
        String[] words = query.split("\\s+");
        List<Product> partialMatches = new ArrayList<>();
        for (String word : words) {
            partialMatches.addAll(productRepository.findAllByNameContainingIgnoreCaseWithMultipleWords(word));
        }
        partialMatches.sort(Comparator.comparing(Product::getName));
        return partialMatches;
    }
}
