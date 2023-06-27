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
import java.util.List;

@Data
@Entity
@Table(name = "subcategories", catalog = "public")
public class SubCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "icon_name")
    private String iconName;

    @Column(name = "path_url")
    private String pathURL;

    //Categories
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Categories categoryId;

    //Product
    @OneToMany(mappedBy = "subcategories")
    private List<Product> products;

    /*
    MALE,
    FEMALE,
    KIDS,
    WINTER,
    SUMMER,
    HOLE,
    BEDROOM,
    BATHROOM,
    KITCHEN...
    */
}