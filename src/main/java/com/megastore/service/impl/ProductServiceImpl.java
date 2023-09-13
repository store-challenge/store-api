package com.megastore.service.impl;

import com.megastore.model.Product;
import com.megastore.model.Images;
import com.megastore.model.SubCategories;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductService;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final JdbcTemplate jdbcTemplate;
    public ProductServiceImpl(ProductRepository productRepository, JdbcTemplate jdbcTemplate) {
        this.productRepository = productRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findHotProducts(int limit, Long categoryId) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT p.*, s.*, c.*, i.* FROM product p ");
        sql.append("JOIN subcategories s ON p.subcategory_id = s.id ");
        sql.append("JOIN categories c ON s.category_id = c.id ");
        sql.append("JOIN images i ON p.id = i.product_id ");
        sql.append("WHERE p.product_hot = true ");

        if (categoryId != null) {
            sql.append("AND s.category_id = ? ");
        }

        sql.append("ORDER BY RANDOM() ");
        sql.append("LIMIT ?");

        List<Object> params = new ArrayList<>();
        if (categoryId != null) {
            params.add(categoryId);
        }
        params.add(limit);

        return jdbcTemplate.query(sql.toString(), params.toArray(), (rs, rowNum) -> {
            Product product = new Product();
            product.setId(rs.getLong("id"));
            product.setName(rs.getString("product_title"));
            product.setPrice(rs.getBigDecimal("product_price"));
            product.setDescription(rs.getString("product_description"));
            product.setIsHotProduct(rs.getBoolean("product_hot"));
            product.setProductAvailable(rs.getInt("product_available"));
            product.setProductArticle(rs.getInt("product_article"));

            SubCategories subCategories = new SubCategories();
            subCategories.setId(rs.getLong("subcategory_id"));
            product.setSubCategories(subCategories);

            List<Images> imagesList = new ArrayList<>();
            Images image = new Images();
            image.setId(rs.getLong("id"));
            image.setPathImageURL(rs.getString("path_url"));
            imagesList.add(image);
            product.setImages(imagesList);

            return product;
        });
    }


    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAll() {
        return productRepository.findAll();
    }
}
