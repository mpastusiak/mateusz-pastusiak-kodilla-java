package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderServicesFromSuppliers {
    public boolean order(HashMap<Product, Integer> userOrderProductsMap) {
        boolean isFullOrder = true;
        for (Map.Entry<Product, Integer> productIntegerEntry : userOrderProductsMap.entrySet()) {
            Map.Entry pair = (Map.Entry) productIntegerEntry;
            if (!isOrderFromSupplier((Product) pair.getKey(), (int) pair.getValue()))
                isFullOrder = false;
        }
       return isFullOrder;
    }

    private boolean isOrderFromSupplier(Product product, int quantity) {
        return product.getSupplier().process(product, quantity);
    }

}
