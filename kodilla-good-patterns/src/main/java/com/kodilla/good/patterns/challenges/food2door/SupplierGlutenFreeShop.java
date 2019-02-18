package com.kodilla.good.patterns.challenges.food2door;

public class SupplierGlutenFreeShop extends Supplier {
    private String name = "GlutenFreeShop";

    @Override
    public boolean process(Product product, int quantity) {
        connectWithSupplier();
        return getResponse(product.getProductName(), quantity);
    }

    public boolean getResponse(String productName, int productQuantity) {
        System.out.println("We check that we have enough " + productName + ", " + productQuantity);
        boolean randomValue = true;
        System.out.println("Our response: " + randomValue);
        return randomValue;
    }
}
