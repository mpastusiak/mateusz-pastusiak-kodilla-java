package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.order.service.StatusOrder;

import java.util.HashMap;

class UserOrderRequestRetriever {
    public UserOrderRequest retrieve() {
        User user = new User("jkowalski@mail.com");

        HashMap<Product, Integer> userOrderProductsMap = new HashMap<>();
        userOrderProductsMap.put(new Product("apple", 123, new SupplierExtraFoodShop()), 2);
        userOrderProductsMap.put(new Product("milk", 234, new SupplierGlutenFreeShop()), 3);
        userOrderProductsMap.put(new Product("potato", 345, new SupplierHealthyShop()), 5);

        StatusOrder statusOrder = new StatusOrder("new", "This is message for new order!");

        return new UserOrderRequest(user, userOrderProductsMap, statusOrder);
    }
}
