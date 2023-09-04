package com.megastore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.megastore.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductRepository extends BaseRepository<Product> {
    @Query(value = "SELECT p.*, s.*, c.*, i.* FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true AND s.category_id = :categoryId ORDER BY RANDOM()",
            countQuery = "SELECT COUNT(p.id) FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true AND s.category_id = :categoryId",
            nativeQuery = true)
    List<Product> findTopByIsHotProduct(Pageable pageable, @Param("categoryId") long categoryId);
    @Query(value = "SELECT p.*, s.*, c.*, i.* FROM product p JOIN subcategories s ON p.subcategory_id = s.id JOIN categories c ON s.category_id = c.id JOIN images i ON p.id = i.product_id WHERE p.product_hot = true ORDER BY RANDOM() LIMIT :limit",
            nativeQuery = true)
    List<Product> findRandomHotProducts(int limit);

    @Query(value = "SELECT * " +
            "FROM product p " +
            "JOIN subcategories s ON p.subcategory_id = s.id " +
            "JOIN categories c ON s.category_id = c.id " +
            "JOIN images img ON img.product_id = p.id " +
            "WHERE s.id = :subcategoryId " +
            "AND p.product_price BETWEEN :priceFrom AND :priceTo " +
            "AND (COALESCE(:brand, '') = '' OR p.product_brand LIKE :brand) " +
            "ORDER BY " +
            "   CASE WHEN :sortBy = 'p.updated' AND :orderBy = 'DESC' THEN p.updated END DESC , " +
            "   CASE WHEN :sortBy = 'p.updated' AND :orderBy = 'ASC' THEN p.updated END ASC , " +
            "   CASE WHEN :sortBy = 'p.product_title' AND :orderBy = 'DESC' THEN p.product_title END DESC , " +
            "   CASE WHEN :sortBy = 'p.product_title' AND :orderBy = 'ASC' THEN p.product_title END ASC , " +
            "   CASE WHEN :sortBy = 'p.product_price' AND :orderBy = 'DESC' THEN p.product_price END DESC , " +
            "   CASE WHEN :sortBy = 'p.product_price' AND :orderBy = 'ASC' THEN p.product_price END ASC  " +
            "LIMIT :limit ",
            nativeQuery = true)
    Collection<Product> findAll(@Param("subcategoryId") long subcategoryId,
                                @Param("priceFrom") double priceFrom,
                                @Param("priceTo") double priceTo,
                                @Param("brand") String brand,
                                @Param("sortBy") String sortBy,
                                @Param("orderBy") String orderBy,
                                @Param("limit") int limit);

}
