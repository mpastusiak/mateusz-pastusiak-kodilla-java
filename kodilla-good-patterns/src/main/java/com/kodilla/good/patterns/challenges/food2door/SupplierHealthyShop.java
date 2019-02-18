package com.kodilla.good.patterns.challenges.food2door;

public class SupplierHealthyShop extends Supplier {
    private String name = "HealthyShop";

    @Override
    public boolean process(Product product, int quantity) {
        connectWithSupplier();
        String supplierResponse = getResponse(product, quantity);
        return isConfirm(supplierResponse);
    }

    public String getResponse(Product product, int quantity) {
        int randomValue = 2;
        String stringResponse;

        if (randomValue == 0) {
            stringResponse = "We don't have this product now!";
        } else if (randomValue == 1) {
            stringResponse = "We have only 1 [unit] of this product!";
        } else {
            stringResponse = "We confirm your order for " + product.getProductName() + " (" + quantity + " unit)";
        }

        System.out.println("Our response: " + stringResponse);
        return stringResponse;
    }

    private boolean isConfirm(String supplierResponse) {
        return supplierResponse.contains("We confirm your order for ");
    }
}