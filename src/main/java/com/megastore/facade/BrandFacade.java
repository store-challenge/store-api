package com.megastore.facade;

import com.megastore.data.dto.BrandDto;

import java.util.Collection;

public interface BrandFacade {
    Collection<BrandDto> findAll();

    Collection<BrandDto> findAllBySubcategory_Id(Long subcategoryId);

    Collection<BrandDto> findAllBySearchedProducts(String productName);
}
