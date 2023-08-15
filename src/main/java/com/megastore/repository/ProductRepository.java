package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends BaseRepository<Product> {
   @Query(value = "SELECT * FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id WHERE p.product_hot = true and s.category_id =:catId ORDER BY RANDOM()LIMIT :limit  ",nativeQuery = true)
    List<Product> findTopByIsHotProduct(int limit, long catId);
}
