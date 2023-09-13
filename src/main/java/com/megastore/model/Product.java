package com.megastore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product", catalog = "public")
public class Product extends BaseEntity {

    @Column(name = "product_title", nullable = false)
    private String name;

    @Column(name = "product_price", columnDefinition = "decimal (10,2)", nullable = false)
    private BigDecimal price;

    @Column(name = "product_description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "product_hot", nullable = false)
    private Boolean isHotProduct;

    @Column(name = "product_available", nullable = false)
    private Integer productAvailable;

    @Column(name = "product_article", nullable = false)
    private Integer productArticle;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategory_id", referencedColumnName = "id")
    private SubCategories subCategories;


    @OneToMany(mappedBy = "product")
    private List<Images> images;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    private Brand brand;

    public Product() {
        super();
        this.price = BigDecimal.valueOf(0.0);
        this.images = new ArrayList<>();
    }
}
