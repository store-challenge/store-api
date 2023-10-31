package com.megastore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "receivers")
public class Receiver extends BaseEntity {

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    //Order
    @OneToMany
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private List<Order> orders = new ArrayList<>();

    public Receiver() {
        super();
    }

    public void addOrder(Order order) {
        order.setReceiver(this);
        orders.add(order);
    }
}