package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends BaseRepository<Product> {
    @Query(value = "SELECT p.*, s.*, c.*, i.* FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true AND s.category_id = :catId ORDER BY RANDOM()",
            countQuery = "SELECT COUNT(p.id) FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true AND s.category_id = :catId",
            nativeQuery = true)
    List<Product> findTopByIsHotProduct(Pageable pageable, @Param("catId") long catId);
}
