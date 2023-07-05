package com.megastore.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
@Data
@Entity
@Table(name = "product", catalog = "public")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="product_title")
    private String name;

    @Column(name = "product_price", columnDefinition = "decimal (10,2)")
    private BigDecimal price;

    @Column(name = "product_description")
    private String description;

    @Column(name = "product_is_hot")
    private String isHotProduct;

    //SubCategories
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategory_id", referencedColumnName = "id")
    private SubCategories subCategoryId;

    //Product
    @OneToMany(mappedBy = "product")
    private List<Images> images;
}
