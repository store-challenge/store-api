package com.megastore.facade;

import com.megastore.data.dto.ProductHotDto;
import com.megastore.data.dto.ProductPDPDto;
import com.megastore.data.dto.ProductPLPDto;
import com.megastore.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ProductFacade {
    Optional<ProductPDPDto> findProductById(Long id);

    Collection<ProductPLPDto> findAll(Long subcategoryId,
                                      String productName,
                                      Double priceFrom,
                                      Double priceTo,
                                      Long brand,
                                      String sortBy,
                                      String orderBy,
                                      Integer limit);

    Set<ProductHotDto> findHotProducts(int limit, Long categoryId);

    }

