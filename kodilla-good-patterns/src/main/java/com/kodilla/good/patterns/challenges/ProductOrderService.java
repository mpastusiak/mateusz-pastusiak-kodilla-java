package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, int quantity) {
        if (isActiveUser(user) && areEnoughQuntityOfProduct(product, quantity))
            return true;
        else
            return false;
    }

    public boolean isActiveUser(User user) {
        if (Objects.equals(user.getUserStatus(), "active"))
            return true;
        else
            return false;
    }

    public boolean areEnoughQuntityOfProduct(Product product, int quantity) {
        if (quantity <= product.getQuantityInStock())
            return true;
        else
            return false;
    }
}
