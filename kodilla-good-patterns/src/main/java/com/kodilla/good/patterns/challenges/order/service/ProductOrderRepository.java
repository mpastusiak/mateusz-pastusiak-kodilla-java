package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, LocalDateTime orderTime, Product product, int quantity, StatusOrder statusOrder) {
        //add to DataBase method
    }
}
