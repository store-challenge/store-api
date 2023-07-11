package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends BaseRepository<Product> {
    Optional<Product> findHotProducts();
}
