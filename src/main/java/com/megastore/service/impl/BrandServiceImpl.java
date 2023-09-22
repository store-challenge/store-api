package com.megastore.service.impl;

import com.megastore.model.Brand;
import com.megastore.repository.BrandRepository;
import com.megastore.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Collection<Brand> findAll() {
        return brandRepository.findAll();
    }
}
