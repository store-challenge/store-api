package com.megastore.facade;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;

import java.util.Collection;
import java.util.List;

public interface ProductFacade {
    ProductPDPDto findById(Long id);

    Collection<ProductPLPDto> findAll(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<ProductPLPDto> findAllSortedByNameDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<ProductPLPDto> findAllSortedByNameASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<ProductPLPDto> findAllSortedByPriceDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    Collection<ProductPLPDto> findAllSortedByPriceASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    List<ProductHotDto> findHotProducts(int limit, long catId);


}

