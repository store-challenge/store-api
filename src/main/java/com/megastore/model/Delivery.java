package com.megastore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    private Long id;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "typeDelivery", nullable = false)
    private String typeDelivery;

    //Order
    @MapsId
    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;
}