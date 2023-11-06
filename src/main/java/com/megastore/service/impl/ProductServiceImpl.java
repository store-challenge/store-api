package com.megastore.service.impl;

import com.megastore.model.Brand;
import com.megastore.model.Categories;
import com.megastore.model.Product;
import com.megastore.model.Images;
import com.megastore.model.SubCategories;
import com.megastore.repository.ProductRepository;
import com.megastore.service.ProductService;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

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
    public Set<Product> findHotProducts(int limit, Long categoryId) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT DISTINCT ON (i.id) p.*, s.*, c.*, i.* FROM product p ");
        sql.append("JOIN subcategories s ON p.subcategory_id = s.id ");
        sql.append("JOIN categories c ON s.category_id = c.id ");
        sql.append("JOIN images i ON p.id = i.product_id ");
        sql.append("GROUP BY p.id, s.id, c.id, i.id ");
        sql.append("HAVING p.product_hot = true ");

        if (categoryId != null) {
            sql.append("AND s.category_id = " + categoryId + " ");
        } else {
            sql.append("AND s.category_id >= (random()*10) ");
        }

        sql.append("LIMIT " + limit + " ");

        return new HashSet<>(jdbcTemplate.query(sql.toString(), (rs, rowNum) -> {
            Product product = new Product();
            product.setId(rs.getLong("id"));
            product.setName(rs.getString("product_title"));
            product.setPrice(rs.getBigDecimal("product_price"));
            product.setProductDiscount(rs.getBigDecimal("product_discount"));
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
        }));
    }


    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findProductById(Long id) {
        return Optional.ofNullable(productRepository.findProductById(id));
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> findAll(Long subcategoryId,
                                       String productName,
                                       Double priceFrom,
                                       Double priceTo,
                                       Set<Long> brands,
                                       String sortBy,
                                       String orderBy,
                                       Integer limit) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT *, c.name as category_name, b.name as brand_name FROM product p ");
        sql.append("JOIN subcategories s ON p.subcategory_id = s.id ");
        sql.append("JOIN categories c ON s.category_id = c.id ");
        sql.append("JOIN images img ON p.id = img.product_id ");
        sql.append("JOIN brand b ON p.brand_id = b.id ");

        if (subcategoryId != null) {
            sql.append("WHERE s.id = " + subcategoryId + " ");
        }

        if (productName != null && productName.length() >= 3) {
            String escapedProductName = productName.replace("'", "''").toLowerCase();
            sql.append("WHERE LOWER(p.product_title) LIKE '%" + escapedProductName + "%' ");
        }

        if (priceFrom != null && priceTo != null) {
            sql.append("AND p.product_price BETWEEN " + priceFrom + " AND " + priceTo + "  ");
        } else if (priceFrom != null && priceTo == null) {
            sql.append("AND p.product_price >= " + priceFrom + "  ");
        } else if (priceFrom == null && priceTo != null) {
            sql.append("AND p.product_price <= " + priceTo + "  ");
        }
        if (brands != null && !brands.isEmpty()) {
            sql.append("AND ");
            sql.append("b.id IN (" + brands.stream().map(String::valueOf).collect(Collectors.joining(",")) + ") ");
        }

        if (sortBy != null) {
            sql.append("ORDER BY p.");
            sql.append(sortBy + " ");
            if (sortBy.equals("product_title")) {
            } else if (sortBy.equals("product_price")) {
            }
        }

        sql.append(" ");

        if (orderBy == "DESC") {
        } else {
            sql.append(orderBy + " ");
        }

        sql.append("LIMIT " + limit);

        return jdbcTemplate.query(sql.toString(), (rs, rowNum) -> {
            Product product = new Product();
            product.setId(rs.getLong("id"));
            product.setName(rs.getString("product_title"));
            product.setPrice(rs.getBigDecimal("product_price"));
            product.setProductDiscount(rs.getBigDecimal("product_discount"));
            product.setDescription(rs.getString("product_description"));
            product.setIsHotProduct(rs.getBoolean("product_hot"));
            product.setProductAvailable(rs.getInt("product_available"));
            product.setProductArticle(rs.getInt("product_article"));

            SubCategories subCategories = new SubCategories();
            subCategories.setId(rs.getLong("subcategory_id"));
            subCategories.setName(rs.getString("name"));
            product.setSubCategories(subCategories);

            Categories categories = new Categories();
            categories.setId(rs.getLong("category_id"));
            categories.setName(rs.getString("category_name"));
            subCategories.setCategories(categories);
            product.setSubCategories(subCategories);

            List<Images> imagesList = new ArrayList<>();
            Images image = new Images();
            image.setId(rs.getLong("id"));
            image.setPathImageURL(rs.getString("path_url"));
            imagesList.add(image);
            product.setImages(imagesList);

            Brand brandProduct = new Brand();
            brandProduct.setId(rs.getLong("brand_id"));
            brandProduct.setName(rs.getString("brand_name"));
            product.setBrand(brandProduct);

            return product;
        });
    }

}
