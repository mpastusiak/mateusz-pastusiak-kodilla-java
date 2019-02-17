package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class SupplierHealthyShop extends Supplier {
    private String name = "HealthyShop";

    @Override
    public boolean process(Product product, int quantity) {
        connectWithSupplier();
        String supplierResponse = suppliersDataRetriever.getSupplierHealthyShopResponse(product, quantity);
        return isConfirm(supplierResponse);
    }

    private boolean isConfirm(String supplierResponse) {
        return Objects.equals(supplierResponse, "We confirm your order!");
    }
}
