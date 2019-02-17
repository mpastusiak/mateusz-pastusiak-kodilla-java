package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.order.service.StatusOrder;

import java.util.HashMap;

public class UserOrderRequest {
    private final User user;
    private final HashMap<Product, Integer> userOrderProductsMap;
    private final StatusOrder statusOrder;

    public UserOrderRequest(User user, HashMap<Product, Integer> userOrderProductsMap, StatusOrder statusOrder) {
        this.user = user;
        this.userOrderProductsMap = userOrderProductsMap;
        this.statusOrder = statusOrder;
    }

    public User getUser() {
        return user;
    }

    public HashMap<Product, Integer> getUserOrderProductsMap() {
        return userOrderProductsMap;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }
}
