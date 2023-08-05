package com.megastore.model;

import lombok.Data;
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
public class Product extends  BaseEntity{
    @Column(name="product_title")
    private String name;

    @Column(name = "product_price", columnDefinition = "decimal (10,2)")
    private BigDecimal price;

    @Column(name = "product_description")
    private String description;

    @Column(name = "product_hot")
    private Boolean isHotProduct;

    @Column(name = "product_brand")
    private String brand;

    @Column(name = "product_made")
    private String made;

    @Column(name = "product_type")
    private String type;

    @Column(name = "product_material")
    private String material;

    @Column(name = "product_size")
    private String size;

    @Column(name = "product_quantity", nullable = false)
    private Integer quantity;

    //SubCategories
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategory_id", referencedColumnName = "id")
    private SubCategories subCategories;

    //Images
    @OneToMany(mappedBy = "product")
    private List<Images> images;

    public Product(){
        super();
        this.price= BigDecimal.valueOf(0.0);
        this.images=new ArrayList<>();
    }
}
