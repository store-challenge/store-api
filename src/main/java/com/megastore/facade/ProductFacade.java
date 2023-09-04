package com.megastore.facade;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface ProductFacade {
    ProductPDPDto findById(Long id);

    Collection<ProductPLPDto> findAll(long subcategoryId,
                                      double priceFrom,
                                      double priceTo,
                                      String brand,
                                      String sortBy,
                                      String orderBy,
                                      int limit);

    List<ProductHotDto> findHotProducts(int limit, long categoryId);

    List<ProductHotDto> findRandomHotProducts(int limit);
    }

