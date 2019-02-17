package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, int quantity) {
        return isActiveUser(user) && areEnoughQuntityOfProduct(product, quantity);
    }

    private boolean isActiveUser(User user) {
        return Objects.equals(user.getUserStatus(), "active");
    }

    private boolean areEnoughQuntityOfProduct(Product product, int quantity) {
        return quantity <= product.getQuantityInStock();
    }
}
