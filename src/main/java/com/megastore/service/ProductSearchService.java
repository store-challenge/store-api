package com.megastore.service;

import com.megastore.data.dto.ProductPDPDto;
import com.megastore.model.Product;

import java.util.Collection;

public interface ProductSearchService {

    Collection<Product> search(String query);
}
