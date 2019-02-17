package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;

public class SuppliersDataRetriever {
    public HashMap<Integer, Integer> getExtraFoodShopProductsMap() {
        HashMap<Integer, Integer> productsMap = new HashMap<>();
        productsMap.put(123, 1000);
        productsMap.put(111, 10);
        productsMap.put(222, 0);
        System.out.println("It's our products list with quantity:");
        System.out.println(productsMap.toString());
        return productsMap;
    }

    public boolean getGlutenFreeShopResponse(String productName, int productQuantity) {
        boolean randomValue = true;
        System.out.println("Our response: " + randomValue);
        return randomValue;
    }

    public String getSupplierHealthyShopResponse(Product product, int quantity) {
        int randomValue = 2;
        String stringResponse;

        if (randomValue == 0) {
            stringResponse = "We don't have this product now!";
        } else if (randomValue == 1) {
            stringResponse = "We have only 1 [unit] of this product!";
        } else {
            stringResponse = "We confirm your order!";
        }

        System.out.println("Our response: " + stringResponse);
        return stringResponse;
    }
}
