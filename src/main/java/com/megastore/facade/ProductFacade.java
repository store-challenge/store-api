package com.megastore.facade;

import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;

import java.util.Collection;

public interface ProductFacade {
    ProductPDPDto findById(Long id);

    Collection<ProductPLPDto> findAll();
}
