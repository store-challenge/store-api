package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends BaseRepository<Product> {
    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "WHERE p.product_hot = true and s.category_id =:catId " +
            "ORDER BY RANDOM() " +
            "LIMIT :limit  ", nativeQuery = true)
    List<Product> findTopByIsHotProduct(int limit, long catId);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN images img ON img.product_id = p.id " +
            "ORDER BY p.created DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAll(int limit);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN images img ON img.product_id = p.id " +
            "ORDER BY p.product_title DESC, p.created DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByNameDESC(int limit);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN images img ON img.product_id = p.id " +
            "ORDER BY p.product_title ASC, p.created DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByNameASC(int limit);
    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN images img ON img.product_id = p.id " +
            "ORDER BY p.product_price DESC, p.created DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByPriceDESC(int limit);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN images img ON img.product_id = p.id " +
            "ORDER BY p.product_price ASC, p.created DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByPriceASC(int limit);

}
