package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "jkowalski@mail.com", "active");

        LocalDateTime orderTime = LocalDateTime.of(2019, 02, 05, 12, 00);

        Product product = new Product("Xbox One", 1234567890, 10);
        int quantity = 3;

        StatusOrder statusOrder = new StatusOrder("new", "Information for Client");

        return new OrderRequest(user, orderTime, product, quantity, statusOrder);
    }
}
