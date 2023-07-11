package com.megastore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updated;

    public BaseEntity() {
        this.created = new Date();
        this.updated = new Date();
    }

    @PreUpdate
    private void preUpdate() {
        this.updated = new Date();
    }
}
