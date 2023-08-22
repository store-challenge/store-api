package com.megastore.repository;

import com.megastore.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductRepository extends BaseRepository<Product> {
    @Query(value = "SELECT p.*, s.*, c.*, i.* FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true AND s.category_id = :catId ORDER BY RANDOM()",
            countQuery = "SELECT COUNT(p.id) FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true AND s.category_id = :catId",
            nativeQuery = true)
    List<Product> findTopByIsHotProduct(Pageable pageable, @Param("catId") long catId);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND (COALESCE(:brand, '') = '' OR p.product_brand LIKE :brand) " +
            "ORDER BY p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAll(@Param("limit") int limit, @Param("subcategoryId") long subcategoryId, @Param("priceFrom") Double priceFrom, @Param("priceTo") Double priceTo, @Param("brand") String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND (COALESCE(:brand, '') = '' OR p.product_brand LIKE :brand) " +
            "ORDER BY p.product_title DESC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByNameDESC(@Param("limit") int limit, @Param("subcategoryId") long subcategoryId, @Param("priceFrom") Double priceFrom, @Param("priceTo") Double priceTo, @Param("brand") String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND (COALESCE(:brand, '') = '' OR p.product_brand LIKE :brand) " +
            "ORDER BY p.product_title ASC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByNameASC(@Param("limit") int limit, @Param("subcategoryId") long subcategoryId, @Param("priceFrom") Double priceFrom, @Param("priceTo") Double priceTo, @Param("brand") String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND (COALESCE(:brand, '') = '' OR p.product_brand LIKE :brand) " +
            "ORDER BY p.product_price DESC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByPriceDESC(@Param("limit") int limit, @Param("subcategoryId") long subcategoryId, @Param("priceFrom") Double priceFrom, @Param("priceTo") Double priceTo, @Param("brand") String brand);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND (COALESCE(:brand, '') = '' OR p.product_brand LIKE :brand) " +
            "ORDER BY p.product_price ASC, p.updated DESC " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAllSortedByPriceASC(@Param("limit") int limit, @Param("subcategoryId") long subcategoryId, @Param("priceFrom") Double priceFrom, @Param("priceTo") Double priceTo, @Param("brand") String brand);

}
