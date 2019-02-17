package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    private Product product;
    private int quantity;
    private StatusOrder statusOrder;

    public OrderRequest (final User user, final LocalDateTime orderTime, final Product product, final int quantity,
                         final StatusOrder statusOrder) {
        this.user = user;
        this.orderTime = orderTime;
        this.product = product;
        this.quantity = quantity;
        this.statusOrder = statusOrder;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }
}