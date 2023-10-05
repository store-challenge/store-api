package com.megastore.facade.impl;

import com.megastore.data.dto.ProductPLPDto;
import com.megastore.facade.SearchProductFacade;
import com.megastore.service.ProductSearchService;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class SearchProductFacadeImpl implements SearchProductFacade {

    private final ProductSearchService productService;

    public SearchProductFacadeImpl(ProductSearchService productService) {
        this.productService = productService;
    }

    @Override
    public Collection<ProductPLPDto> search(String query) {
        return productService.search(query).stream().map(ProductPLPDto::new).toList();
    }
}
