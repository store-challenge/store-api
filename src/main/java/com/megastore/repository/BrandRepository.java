package com.megastore.repository;

import com.megastore.model.Brand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends BaseRepository<Brand> {

    @Query(value = "SELECT b.* FROM brand b ORDER BY b.name ASC", nativeQuery = true)
    List<Brand> findAll(Long subcategoryId, String productName);
}
