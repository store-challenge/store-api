package com.megastore.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "categories", catalog = "public")
public class Categories extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "icon", nullable = false)
    private String iconName;

    @Column(name = "path_url", nullable = false)
    private String pathURL;  /* "/closers" */

    @OneToMany(mappedBy = "categories")
    private Set<SubCategories> subCategories;

    public Categories() {
        super();
        this.subCategories = new HashSet<>();
    }
    /*CLOSERS,
    SPORTS,
    FURNITURE,
    APPLIANCES,
    BOOKS,
    BEAUTY,
    BUILDING,
    PETS;*/
}