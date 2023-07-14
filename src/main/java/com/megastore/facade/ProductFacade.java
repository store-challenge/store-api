package com.megastore.facade;

import com.megastore.dto.ProductPDPDto;
import com.megastore.dto.ProductPLPDto;

import java.util.Collection;

public interface ProductFacade {
    ProductPDPDto findById(Long id);

    Collection<ProductPLPDto> findAll();
}
