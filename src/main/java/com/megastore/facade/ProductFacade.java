package com.megastore.facade;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface ProductFacade {
    ProductPDPDto findProductById(Long id);

    Collection<ProductPLPDto> findAll(Long subcategoryId,
                                      Double priceFrom,
                                      Double priceTo,
                                      Long brand,
                                      String sortBy,
                                      String orderBy,
                                      Integer limit);

    List<ProductHotDto> findHotProducts(int limit, Long categoryId);

    }

