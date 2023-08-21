package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

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
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND p.product_brand = :brand " +
            "ORDER BY p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAll(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND p.product_brand = :brand " +
            "ORDER BY p.product_title DESC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByNameDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND p.product_brand = :brand " +
            "ORDER BY p.product_title ASC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByNameASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND p.product_brand = :brand " +
            "ORDER BY p.product_price DESC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByPriceDESC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND p.product_brand = :brand " +
            "ORDER BY p.product_price ASC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByPriceASC(int limit, long subcategoryId, Double priceFrom, Double priceTo, String brand);

}
