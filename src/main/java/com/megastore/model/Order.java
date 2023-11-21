package com.megastore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, optional = false)
    private Delivery delivery;

    @Column(nullable = false)
    private String typePayment;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, optional = false)
    private Cart cart;

    @Column(name = "cart_sum", columnDefinition = "decimal (10,2)", nullable = false)
    private BigDecimal cartSum;

    public void setDelivery(Delivery delivery) {
        delivery.setOrder(this);
        this.delivery = delivery;
    }

    public void setCart(Cart cart) {
        cart.setOrder(this);
        this.cart = cart;
    }

}