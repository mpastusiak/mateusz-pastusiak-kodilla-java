package com.kodilla.good.patterns.challenges.order.service;

interface OrderService {
    boolean order(User user, Product product, int quantity);
}
