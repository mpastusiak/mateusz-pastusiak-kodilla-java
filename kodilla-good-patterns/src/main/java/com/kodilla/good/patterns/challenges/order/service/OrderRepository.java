package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

interface OrderRepository {
    void createOrder(User user, LocalDateTime orderTime, Product product, int quantity, StatusOrder statusOrder);
}
