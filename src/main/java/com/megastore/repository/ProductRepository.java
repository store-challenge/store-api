package com.megastore.repository;


import com.megastore.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface ProductRepository extends BaseRepository<Product> {

    @Query(nativeQuery = true, value = "SELECT p.*, s.*, c.*, i.* " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images i ON p.id = i.product_id WHERE p.id =:id")
    Product findProductById (Long id);

    Collection<Product> findAllByNameContainingIgnoreCase(String query);

}
