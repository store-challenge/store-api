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
    public Collection<BrandDto> findAll(Long subcategoryId, String productName) {
        return brandService.findAll(subcategoryId, productName).stream().map(BrandDto::new).toList();
    }

}
