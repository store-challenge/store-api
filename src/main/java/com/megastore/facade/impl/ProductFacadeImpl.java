package com.megastore.facade.impl;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.data.dto.SubCategoriesDto;
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
    public Collection<ProductPLPDto> findAll() {
        return null;
    }

    @Override
    public List<ProductHotDto> findHotProducts(int limit, long catId) {
        return productService.findHotProducts(limit, catId).stream().map(ProductHotDto::new).toList();
    }
}
