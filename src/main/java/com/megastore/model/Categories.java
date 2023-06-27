package com.megastore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "categories", catalog = "public")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "icon_name")
    private String iconName;

    @Column(name = "path_url")
    private String pathURL;  /* "/closers" */

    @OneToMany(mappedBy = "categories")
    private Set<SubCategories> subCategories;

    /*CLOSERS,
    SPORTS,
    FURNITURE,
    APPLIANCES,
    BOOKS,
    BEAUTY,
    BUILDING,
    PETS;*/
}