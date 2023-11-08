package com.megastore.service.impl;

import com.megastore.model.Brand;
import com.megastore.repository.BrandRepository;
import com.megastore.service.BrandService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final JdbcTemplate jdbcTemplate;

    public BrandServiceImpl(BrandRepository brandRepository, JdbcTemplate jdbcTemplate) {
        this.brandRepository = brandRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Brand> findAllBySubcategory_Id(Long subcategoryId) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT DISTINCT p.brand_id, b.name as brand_name FROM product p ");
        sql.append("JOIN subcategories s ON p.subcategory_id = s.id ");
        sql.append("JOIN brand b ON p.brand_id = b.id ");
        sql.append("WHERE s.id = " + subcategoryId + " ");

        return jdbcTemplate.query(sql.toString(), (rs, rowNum) -> {
            Brand brandProduct = new Brand();
            brandProduct.setId(rs.getLong("brand_id"));
            brandProduct.setName(rs.getString("brand_name"));
            return brandProduct;
        });
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Brand> findAllByProducts_Id(String productName) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT DISTINCT p.brand_id, b.name as brand_name FROM product p ");
        sql.append("JOIN brand b ON p.brand_id = b.id ");

        if (productName != null && productName.length() >= 3) {
            String escapedProductName = productName
                    .trim()
                    .replace("'", "''")
                    .replaceAll("\s+", " ")
                    .toLowerCase();
            sql.append("WHERE LOWER(p.product_title) LIKE '%" + escapedProductName + "%' ");
        }

        return jdbcTemplate.query(sql.toString(), (rs, rowNum) -> {
            Brand brandProduct = new Brand();
            brandProduct.setId(rs.getLong("brand_id"));
            brandProduct.setName(rs.getString("brand_name"));
            return brandProduct;
        });
    }
}
