package com.megastore.facade.impl;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.ProductFacade;
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
    public ProductPDPDto findById(Long id) {
        return null;
    }

    @Override
    public Collection<ProductPLPDto> findAll(long subcategoryId,
                                             double priceFrom,
                                             double priceTo,
                                             String brand,
                                             String sortBy,
                                             String orderBy,
                                             int limit) {
        return productService.findAll(subcategoryId,
                priceFrom,
                priceTo,
                brand,
                sortBy,
                orderBy,
                limit).stream().map(ProductPLPDto::new).toList();
    }

    @Override
    public List<ProductHotDto> findHotProducts(int limit, long catId) {
        return productService.findHotProducts(limit, catId).stream().map(ProductHotDto::new).toList();
    }
}
