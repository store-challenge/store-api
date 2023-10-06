package com.megastore.facade;

import com.megastore.data.dto.ProductPLPDto;

import java.util.Collection;

public interface SearchProductFacade {
    Collection<ProductPLPDto> search(String query);
}
