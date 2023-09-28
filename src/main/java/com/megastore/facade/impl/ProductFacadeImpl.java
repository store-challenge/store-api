package com.megastore.facade.impl;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;
import com.megastore.model.Product;
import com.megastore.service.ProductService;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductFacadeImpl implements ProductFacade {

    private final ProductService productService;

    public ProductFacadeImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Optional<ProductPDPDto> findProductById(Long id) {
        Optional<Product> optionalProduct = productService.findProductById(id);

        if (optionalProduct.isEmpty()) {
            return Optional.empty();
        }

        Product product = optionalProduct.get();
        return Optional.of(new ProductPDPDto(product));
    }

    @Override
    public Collection<ProductPLPDto> findAll(Long subcategoryId,
                                             String productName,
                                             Double priceFrom,
                                             Double priceTo,
                                             Set<Long> brands,
                                             String sortBy,
                                             String orderBy,
                                             Integer limit) {
        return productService.findAll(subcategoryId,
                productName,
                priceFrom,
                priceTo,
                brands,
                sortBy,
                orderBy,
                limit).stream().map(ProductPLPDto::new).toList();
    }

    @Override
    public Set<ProductHotDto> findHotProducts(int limit, Long categoryId) {
        return productService.findHotProducts(limit, categoryId).stream().map(ProductHotDto::new).collect(Collectors.toSet());
    }

}
