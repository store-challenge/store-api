package com.megastore.facade.impl;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;
import com.megastore.model.Product;
import com.megastore.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ProductFacadeImpl implements ProductFacade {

    private final ProductService productService;

    public ProductFacadeImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ProductPDPDto findProductById(Long id) {
        Product product = productService.findProductById(id).get();
        return new ProductPDPDto(product);
    }

    @Override
    public Collection<ProductPLPDto> findAll(Long subcategoryId,
                                             Double priceFrom,
                                             Double priceTo,
                                             String brand,
                                             String sortBy,
                                             String orderBy,
                                             Integer limit) {
        return productService.findAll(subcategoryId,
                priceFrom,
                priceTo,
                brand,
                sortBy,
                orderBy,
                limit).stream().map(ProductPLPDto::new).toList();
    }

    @Override
    public List<ProductHotDto> findHotProducts(int limit, Long categoryId) {
        return productService.findHotProducts(limit, categoryId).stream().map(ProductHotDto::new).toList();
    }

}
