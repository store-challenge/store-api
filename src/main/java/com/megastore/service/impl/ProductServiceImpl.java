package com.megastore.service.impl;

import com.megastore.model.Brand;
import com.megastore.model.Product;
import com.megastore.model.Images;
import com.megastore.model.SubCategories;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

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
    public Optional<Product> findProductById(Long id) {
        return Optional.ofNullable(productRepository.findProductById(id));
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAll(Long subcategoryId,
                                       Double priceFrom,
                                       Double priceTo,
                                       String brand,
                                       String sortBy,
                                       String orderBy,
                                       Integer limit) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM product p ");
        sql.append("JOIN subcategories s ON p.subcategory_id = s.id ");
        sql.append("JOIN categories c ON s.category_id = c.id ");
        sql.append("JOIN images img ON p.id = img.product_id ");
//        sql.append("JOIN brand b ON p.brand_id = b.id ");
        sql.append("WHERE s.id = " + subcategoryId + " ");

        List<Object> params = new ArrayList<>();

        if (priceFrom != null) {
            sql.append("AND p.product_price BETWEEN " + priceFrom + " ");
        }

        if (priceTo != null) {
            sql.append("AND " + priceTo + " ");
        }

        if (brand != null || brand == "") {
            sql.append("AND p.product_brand LIKE ? ");
            params.add("%" + brand + "%");
        }

        sql.append("ORDER BY ");

        if (sortBy != "p.updated") {

            if (sortBy == "p.product_title") {
            sql.append(sortBy + " ");
            } else if (sortBy == "p.product_price") {
                    sql.append(sortBy + " ");
                }
            sql.append(sortBy + " ");

        }

        if (orderBy != "DESC") {

            if (orderBy == "ASC") {
                sql.append("ASC ");
            }
            sql.append("DESC ");
        }

        sql.append("LIMIT " + limit);

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

//            Brand brandProduct = new Brand();
//            brandProduct.setId(rs.getLong("brand_id"));
//            product.setBrand(brandProduct);
//            brandProduct.setName(rs.getString("name"));
//            product.setName(brandProduct.getName());

            return product;
        });
    }

}
