package com.megastore.facade.impl;

import com.megastore.data.dto.BrandDto;
import com.megastore.facade.BrandFacade;
import com.megastore.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BrandFacadeImpl implements BrandFacade {

    private final BrandService brandService;

    public BrandFacadeImpl(BrandService brandService) {
        this.brandService = brandService;
    }

    @Override
    public Collection<BrandDto> findAll() {
        return brandService.findAll().stream().map(BrandDto::new).toList();
    }

    @Override
    public Collection<BrandDto> findAllBySubcategory_Id(Long subcategoryId) {
        return brandService.findAllBySubcategory_Id(subcategoryId).stream().map(BrandDto::new).toList();
    }

    @Override
    public Collection<BrandDto> findAllByProducts_Id(String productName) {
        return brandService.findAllByProducts_Id(productName).stream().map(BrandDto::new).toList();
    }
}
