package com.megastore.model;

import java.util.Map;

public class Order {
    private String userName;
    private String userPhone;
    private String userEmail;
    private String userAddress;

    private Map<Product, Integer> orderedProducts;

}
