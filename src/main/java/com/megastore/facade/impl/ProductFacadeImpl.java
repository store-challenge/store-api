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
import java.util.Optional;

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
    public Collection<ProductPLPDto> findAll(int limit) {
        return productService.findAll(limit).stream().map(ProductPLPDto::new).toList();
    }
    @Override
    public Collection<ProductPLPDto> findAllSortedByNameDESC(int limit) {
        return productService.findAllSortedByNameDESC(limit).stream().map(ProductPLPDto::new).toList();
    }
    @Override
    public Collection<ProductPLPDto> findAllSortedByNameASC(int limit) {
        return productService.findAllSortedByNameASC(limit).stream().map(ProductPLPDto::new).toList();
    }
 @Override
    public Collection<ProductPLPDto> findAllSortedByPriceDESC(int limit) {
        return productService.findAllSortedByPriceDESC(limit).stream().map(ProductPLPDto::new).toList();
    }
    @Override
    public Collection<ProductPLPDto> findAllSortedByPriceASC(int limit) {
        return productService.findAllSortedByPriceASC(limit).stream().map(ProductPLPDto::new).toList();
    }

    @Override
    public List<ProductHotDto> findHotProducts(int limit, long catId) {
        return productService.findHotProducts(limit, catId).stream().map(ProductHotDto::new).toList();
    }
}
