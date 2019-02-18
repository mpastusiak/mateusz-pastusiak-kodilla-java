package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;

public class SupplierExtraFoodShop extends Supplier {
    private String name = "ExtraFoodShop";

    @Override
    public boolean process(Product product, int quantity) {
        connectWithSupplier();
        return getProductQuantity(product.getProductNumber()) >= quantity;
    }

    private int getProductQuantity(int productNumber) {
        return getProductsMap().get(productNumber);
    }

    private HashMap<Integer, Integer> getProductsMap() {
        HashMap<Integer, Integer> productsMap = new HashMap<>();
        productsMap.put(123, 1000);
        productsMap.put(111, 10);
        productsMap.put(222, 0);
        System.out.println("It's our products list with quantity:");
        System.out.println(productsMap.toString());
        return productsMap;
    }
}
