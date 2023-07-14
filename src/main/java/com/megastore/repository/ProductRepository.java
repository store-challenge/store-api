package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends BaseRepository<Product> {
    @Query("SELECT p FROM Product p WHERE p.isHotProduct = true")
    Optional<Product> findHotProducts();
}
