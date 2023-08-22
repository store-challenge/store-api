package com.megastore.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "subcategories", catalog = "public")
public class SubCategories extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String iconName;

    //Categories
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Categories categories;

    //Product
    @OneToMany(mappedBy = "subCategories")
    private List<Product> products;

}