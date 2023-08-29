package com.megastore.facade;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;

import java.util.Collection;
import java.util.List;

public interface ProductFacade {
    ProductPDPDto findById(Long id);

    Collection<ProductPLPDto> findAll(long subcategoryId,
                                      Double priceFrom,
                                      Double priceTo,
                                      String brand,
                                      String sortBy,
                                      String orderBy,
                                      int limit);

    List<ProductHotDto> findHotProducts(int limit, long catId);


}

