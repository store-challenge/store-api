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
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "cart", catalog = "public")
public class Cart {

    @Id
    private Long id;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "product_image", nullable = false)
    private Long productImage;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "product_price", columnDefinition = "decimal (10,2)", nullable = false)
    private BigDecimal price;

    @Column(name = "discount_price", columnDefinition = "decimal (10,2)", nullable = false)
    private BigDecimal discountPrice;

    @Column(name = "sum", columnDefinition = "decimal (10,2)", nullable = false)
    private BigDecimal sum;

    //Order
    @MapsId
    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

}