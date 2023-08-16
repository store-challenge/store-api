package com.megastore.facade;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;

import java.util.Collection;
import java.util.List;

public interface ProductFacade {
    ProductPDPDto findById(Long id);

    Collection<ProductPLPDto> findAll(int limit);

    Collection<ProductPLPDto> findAllSortedByNameDESC(int limit);
    Collection<ProductPLPDto> findAllSortedByNameASC(int limit);
    Collection<ProductPLPDto> findAllSortedByPriceDESC(int limit);
    Collection<ProductPLPDto> findAllSortedByPriceASC(int limit);

    List<ProductHotDto> findHotProducts(int limit, long catId);


}

