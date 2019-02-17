package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.order.service.StatusOrder;

import java.util.HashMap;

public class UserOrderRepository {
    public void createOrder(User user, HashMap<Product,Integer> userOrderProductsMap, StatusOrder statusOrder) {
        System.out.println("I'm add order to Data Base!");
    }
}
